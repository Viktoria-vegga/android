package com.example.mitrofanovaviktoria.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.databinding.FragmentListBinding;
import com.example.mitrofanovaviktoria.ui.adapters.MyRecyclerAdapter;
import com.example.mitrofanovaviktoria.ui.viewmodels.UsersListViewModel;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentListBinding binding = FragmentListBinding.inflate(getLayoutInflater());

        UsersListViewModel viewModel = new ViewModelProvider(this).get(UsersListViewModel.class);

        MyRecyclerAdapter adapter = new MyRecyclerAdapter(new ArrayList<>(), requireContext());
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.users.observe(getViewLifecycleOwner(), adapter::updateData);

        binding.sortButton.setOnClickListener(view -> {
            viewModel.sortUsers();
        });

        binding.shuffleButton.setOnClickListener(view -> {
            viewModel.shuffleUsers();
        });

        return binding.getRoot();
    }


}