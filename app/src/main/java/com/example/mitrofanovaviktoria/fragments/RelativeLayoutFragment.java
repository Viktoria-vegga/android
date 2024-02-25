package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
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

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentRelativeLayoutBinding binding = FragmentRelativeLayoutBinding
                .inflate(inflater, container, false);

        Button button = binding.button3;
        button.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "клик на кнопку на RelativeLayout");
        });
        
        return binding.getRoot();
    }
}