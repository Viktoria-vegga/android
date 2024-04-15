package com.example.mitrofanovaviktoria.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.example.mitrofanovaviktoria.databinding.ActivityMainBinding;
import com.example.mitrofanovaviktoria.ui.viewmodels.UserDetailViewMode;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        UserDetailViewMode viewModel = new ViewModelProvider(this).get(UserDetailViewMode.class);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent intent = new Intent(this, MyService.class);
        if (Settings.canDrawOverlays(getApplicationContext())) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                Log.w("MY_TAG", "1");
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        }
    }
}