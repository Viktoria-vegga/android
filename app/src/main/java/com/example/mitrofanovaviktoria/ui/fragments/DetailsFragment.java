package com.example.mitrofanovaviktoria.ui.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
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

        UserDetailViewMode viewModel = new ViewModelProvider(requireActivity()).get(UserDetailViewMode.class);
        viewModel.user.observe(getViewLifecycleOwner(), user -> {
            binding.firstName.setText(user.firstName);
            binding.secondName.setText(user.secondName);
            binding.age.setText(user.age);
            binding.details.setText(user.detailsInformation);
        });

        binding.backButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigateUp();
        });

        Bundle bundle = getArguments();
        if (bundle != null) {
            int userId = bundle.getInt(Constants.BUNDLE_ID_KEY);
            //viewModel.updateUser(userId);
        }

        return binding.getRoot();
    }
}