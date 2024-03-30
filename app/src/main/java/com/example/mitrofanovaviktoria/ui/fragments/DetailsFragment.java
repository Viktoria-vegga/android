package com.example.mitrofanovaviktoria.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.databinding.FragmentDetailsBinding;
import com.example.mitrofanovaviktoria.ui.viewmodels.UserDetailViewMode;

public class DetailsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentDetailsBinding binding = FragmentDetailsBinding.inflate(getLayoutInflater());

        UserDetailViewMode viewModel = new ViewModelProvider(this).get(UserDetailViewMode.class);
        viewModel.user.observe(getViewLifecycleOwner(), users -> {
            binding.firstName.setText(users.firstName);
            binding.secondName.setText(users.secondName);
            binding.age.setText(users.age);
            binding.details.setText(users.detailsInformation);
        });

        binding.backButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigateUp();
        });

        Bundle bundle = getArguments();
        if (bundle != null) {
            viewModel.updateUser(bundle.getInt(Constants.BUNDLE_ID_KEY));
        }

        return binding.getRoot();
    }
}