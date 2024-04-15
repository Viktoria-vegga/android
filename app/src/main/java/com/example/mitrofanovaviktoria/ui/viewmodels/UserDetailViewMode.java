package com.example.mitrofanovaviktoria.ui.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mitrofanovaviktoria.data.AppDatabase;
import com.example.mitrofanovaviktoria.data.Repository;
import com.example.mitrofanovaviktoria.data.User;

public class UserDetailViewMode extends ViewModel {

    private Repository repository;
    public Application application;
    public MutableLiveData<User> user = new MutableLiveData<>();

    public UserDetailViewMode() {
        repository = new Repository(application);
    }
//    public void updateUser(int userId) {
//        this.user.setValue(repository.getUser(userId));
//    }
}
