package com.example.mitrofanovaviktoria.ui.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentConstraintLayoutBinding;

public class ConstraintLayoutFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onCreate");
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onCreateView");
        FragmentConstraintLayoutBinding binding = FragmentConstraintLayoutBinding
                .inflate(inflater, container, false);

        binding.button1.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "нажатие на кнопку на ConstraintLayout");
        });


        binding.image1.setImageDrawable(requireContext().getDrawable(R.drawable.im1));
        
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(Constants.MY_TAG, "ConstraintLayoutFragment onDestroy");
    }
}