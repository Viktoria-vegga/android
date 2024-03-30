package com.example.mitrofanovaviktoria.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.R;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_activity);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "клик на кнопку на RelativeLayout");
        });
    }
}