package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.adapters.MyListViewAdapter;
import com.example.mitrofanovaviktoria.databinding.FragmentListBinding;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentListBinding binding = FragmentListBinding.inflate(getLayoutInflater());

        binding.listView.setAdapter(
                new MyListViewAdapter(
                        requireContext(),
                        R.layout.list_item_layout,
                        Constants.Items()
                )
        );

        binding.listView.setOnItemClickListener((parent, v, position, id) -> {
            Toast.makeText(requireContext(), "нажатие на элемент ListView", Toast.LENGTH_LONG).show();
        });


        return binding.getRoot();
    }


}