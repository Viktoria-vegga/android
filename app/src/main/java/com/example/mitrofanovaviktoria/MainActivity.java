package com.example.mitrofanovaviktoria;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.activities.ConstraintLayoutActivity;
import com.example.mitrofanovaviktoria.activities.LinerLayoutActivity;
import com.example.mitrofanovaviktoria.activities.RelativeLayoutActivity;
import com.example.mitrofanovaviktoria.databinding.ActivityMainBinding;
import com.example.mitrofanovaviktoria.fragments.ButtonsFragment;
import com.example.mitrofanovaviktoria.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                .setReorderingAllowed(true)
//                .add(
//                    R.id.fragment_container,
//                    ButtonsFragment.class,
//                    null
//                )
//                .commit();
//        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        Intent intent = new Intent(this, OverlayService.class);
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