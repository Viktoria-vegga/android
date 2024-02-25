package com.example.mitrofanovaviktoria.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentConstraintLayoutBinding;

public class ConstraintLayoutFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentConstraintLayoutBinding binding = FragmentConstraintLayoutBinding
                .inflate(inflater, container, false);

        binding.button1.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "нажатие на кнопку на ConstraintLayout");
        });


        binding.image1.setImageDrawable(requireContext().getDrawable(R.drawable.im1));
        
        return binding.getRoot();
    }
}