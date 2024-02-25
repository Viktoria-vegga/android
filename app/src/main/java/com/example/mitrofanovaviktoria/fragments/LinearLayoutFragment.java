package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.databinding.FragmentLinearLayoutBinding;

public class LinearLayoutFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentLinearLayoutBinding binding = FragmentLinearLayoutBinding
                .inflate(inflater, container, false);

        //Intent intent = getIntent();

        TextView textView = binding.textView2;
        //textView.setText(intent.getStringExtra("text"));

        Button button = binding.button2;
        button.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "клик на кнопку на LinerLayoutActivity");
        });

        Button resultButton = binding.resultButton;
        resultButton.setOnClickListener(view -> {
//            Intent resultIntent = new Intent();
//            resultIntent.putExtra("resultKey", "переданный результат");
//            setResult(Activity.RESULT_OK, resultIntent);
//            finish();
        });
        
        return binding.getRoot();
    }
}