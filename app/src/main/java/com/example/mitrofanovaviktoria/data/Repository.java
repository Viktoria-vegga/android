package com.example.mitrofanovaviktoria.data;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class Repository {
    private final UserDao db;

    public Repository(Application app) {
        db = AppDatabase.getDataBase(app).dao();
    }

    public MutableLiveData<List<User>> getUsers() {
        MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();

        AppDatabase.databaseWriterExecutor.execute(() -> {
            usersLiveData.postValue(db.getAllItems());
        });

        return usersLiveData;
    }

    public void addUser(User user) {
        AppDatabase.databaseWriterExecutor.execute(() -> {
            db.insert(user);
        });
    }
}
