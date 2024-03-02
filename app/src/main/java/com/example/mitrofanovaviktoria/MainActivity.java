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

public class MainActivity extends AppCompatActivity {

    private final ActivityResultLauncher<Intent> launcher = registerForActivityResult(
        new ActivityResultContracts.StartActivityForResult(),
        result -> {
            Intent data = result.getData();
            TextView textView = findViewById(R.id.result_text_view);
            if (data == null) {
                textView.setText("Результат не был передан");
            } else {
                textView.setText(getString(R.string.app_name));
            }
        }
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOnLinearButton(View view) {
        Intent intent = new Intent(this, LinerLayoutActivity.class);
        intent.putExtra("text", "Текс был передан через putExtra");
        launcher.launch(intent);
    }

    public void relativeOnLinearButton(View view) {
        Intent intent = new Intent(this, RelativeLayoutActivity.class);
        startActivity(intent);
    }

    public void constraintOnLinearButton(View view) {
        Intent intent = new Intent(this, ConstraintLayoutActivity.class);
        startActivity(intent);
    }
}