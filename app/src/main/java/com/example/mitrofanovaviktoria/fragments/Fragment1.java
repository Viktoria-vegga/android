package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment1Binding binding = Fragment1Binding.inflate(getLayoutInflater());

        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE_STRING_KEY, "Данные от первого фрагмента");

        binding.navButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_fragment1_to_fragment2,
                    bundle
            );
        });

        return binding.getRoot();
    }
}