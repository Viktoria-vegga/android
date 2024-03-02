package com.example.mitrofanovaviktoria;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.activities.ConstraintLayoutActivity;
import com.example.mitrofanovaviktoria.activities.LinerLayoutActivity;
import com.example.mitrofanovaviktoria.activities.RelativeLayoutActivity;
import com.example.mitrofanovaviktoria.databinding.ActivityMainBinding;
import com.example.mitrofanovaviktoria.fragments.MainFragment;
import com.example.mitrofanovaviktoria.fragments.ParentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(
                            R.id.fragment_container,
                            ParentFragment.class,
                            null
                    )
                    .commit();
        }

    }
}