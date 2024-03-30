package com.example.mitrofanovaviktoria.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.R;

public class LinerLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_layout);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.text_view2);
        textView.setText(intent.getStringExtra("text"));

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "клик на кнопку на LinerLayoutActivity");
        });

        Button resultButton = findViewById(R.id.result_button);
        resultButton.setOnClickListener(view -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("resultKey", "переданный результат");
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        });
    }
}