package com.example.mitrofanovaviktoria.ui.viewmodels;

import android.text.SegmentFinder;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.data.Repository;
import com.example.mitrofanovaviktoria.data.User;
import com.example.mitrofanovaviktoria.domain.UsersSorterShuffler;

import java.util.ArrayList;

public class UsersListViewModel extends ViewModel {
    public Repository repository;
    public MutableLiveData<ArrayList<User>> users = new MutableLiveData<>();


    public UsersListViewModel() {
        repository = new Repository();
        users.setValue(repository.getUsers());
    }

    public void sortUsers() {
        ArrayList<User> sorted = UsersSorterShuffler.SortUsers(users.getValue());
        users.setValue(sorted);
    }

    public void shuffleUsers() {
        ArrayList<User> shuffled =  UsersSorterShuffler.ShuffleUsers(users.getValue());
        users.setValue(shuffled);
    }
}

