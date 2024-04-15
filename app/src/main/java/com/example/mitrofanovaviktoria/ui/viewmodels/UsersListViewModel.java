package com.example.mitrofanovaviktoria.ui.viewmodels;

import android.app.Application;
import android.text.SegmentFinder;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.data.Repository;
import com.example.mitrofanovaviktoria.data.User;
import com.example.mitrofanovaviktoria.domain.UsersSorterShuffler;

import java.util.ArrayList;
import java.util.List;

public class UsersListViewModel extends ViewModel {
    public Repository repository = null;
    public MutableLiveData<List<User>> users = new MutableLiveData<>();


    public void init(Application application) {
        repository = new Repository(application);
        users = repository.getUsers();
    }

    public void createUser() {
        repository.addUser(new User());
    }
}

