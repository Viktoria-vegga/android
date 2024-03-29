package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.adapters.MyRecyclerAdapter;
import com.example.mitrofanovaviktoria.databinding.FragmentRecyclerBinding;

public class RecyclerFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentRecyclerBinding binding = FragmentRecyclerBinding.inflate(getLayoutInflater());

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerView.setAdapter(new MyRecyclerAdapter(Constants.Items(), requireContext()));

        return binding.getRoot();
    }
}