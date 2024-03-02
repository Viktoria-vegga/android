package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentChildBinding;

public class ChildFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentChildBinding binding = FragmentChildBinding.inflate(inflater, container, false);

        binding.sendButton.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString(Constants.BUNDLE_KEY, "Результат переданный дочернему фрагменту");
            getParentFragmentManager().setFragmentResult(Constants.CHILD_REQUEST_KEY, result);
        });

        return binding.getRoot();
    }
}