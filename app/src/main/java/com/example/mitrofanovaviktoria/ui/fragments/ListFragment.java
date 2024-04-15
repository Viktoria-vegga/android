package com.example.mitrofanovaviktoria.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.data.FileUtils;
import com.example.mitrofanovaviktoria.data.SharedPreferenceUtils;
import com.example.mitrofanovaviktoria.databinding.FragmentListBinding;
import com.example.mitrofanovaviktoria.ui.adapters.MyRecyclerAdapter;
import com.example.mitrofanovaviktoria.ui.viewmodels.UsersListViewModel;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FileUtils.writeToFile(requireContext(), "dataFile.txt", "startFragment");

        FileUtils.writeToExternalStorage("dataFile2.txt", "my data");

        SharedPreferenceUtils.saveData(requireContext(), "my data2");


        FragmentListBinding binding = FragmentListBinding.inflate(getLayoutInflater());

        UsersListViewModel viewModel = new ViewModelProvider(this).get(UsersListViewModel.class);
        viewModel.init(requireActivity().getApplication());

        MyRecyclerAdapter adapter = new MyRecyclerAdapter(new ArrayList<>(), requireContext());
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        viewModel.users.observe(getViewLifecycleOwner(), adapter::updateData);

        binding.createButton.setOnClickListener(view -> {
            viewModel.createUser();
        });

        return binding.getRoot();
    }


}