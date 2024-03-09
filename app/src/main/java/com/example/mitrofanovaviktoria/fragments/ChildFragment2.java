package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentChild2Binding;
import com.example.mitrofanovaviktoria.databinding.FragmentChildBinding;

public class ChildFragment2 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentChild2Binding binding = FragmentChild2Binding.inflate(getLayoutInflater());

        binding.sendButton.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString(Constants.BUNDLE_KEY, "Результат от нижнего фрагмента");
            getParentFragmentManager().setFragmentResult(
                    Constants.REQUEST_KEY, result);
        });

        return binding.getRoot();
    }
}