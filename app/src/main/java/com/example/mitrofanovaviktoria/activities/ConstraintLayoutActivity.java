package com.example.mitrofanovaviktoria.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.ActivityConstraintLayoutBinding;

public class ConstraintLayoutActivity extends AppCompatActivity {

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityConstraintLayoutBinding binding = ActivityConstraintLayoutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "нажатие на кнопку на ConstraintLayout");
        });


        binding.image1.setImageDrawable(getDrawable(R.drawable.im1));
    }
}