package com.example.mitrofanovaviktoria.ui.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mitrofanovaviktoria.data.Repository;
import com.example.mitrofanovaviktoria.data.User;

public class UserDetailViewMode extends ViewModel {

    private Repository repository;
    public MutableLiveData<User> user = new MutableLiveData<>();

    public UserDetailViewMode() {
        repository = new Repository();
    }

    public void updateUser(int userId) {
        this.user.setValue(repository.getUser(userId));
    }
}
