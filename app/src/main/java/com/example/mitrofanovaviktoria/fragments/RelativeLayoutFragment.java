package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentRelativeLayoutBinding;

public class RelativeLayoutFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onCreate");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onCreateView");
        FragmentRelativeLayoutBinding binding = FragmentRelativeLayoutBinding
                .inflate(inflater, container, false);

        Button button = binding.button3;
        button.setOnClickListener(view -> {
            Log.w(Constants.MY_TAG, "клик на кнопку на RelativeLayout");
        });
        
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(Constants.MY_TAG, "RelativeLayoutFragment onDestroy");
    }
}