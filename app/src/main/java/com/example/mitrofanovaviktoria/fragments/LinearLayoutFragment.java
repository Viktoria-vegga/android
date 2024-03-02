package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentLinearLayoutBinding;

public class LinearLayoutFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onCreate");

        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(
                            R.id.child_fragment_container,
                            ChildFragment.class,
                            null
                    )
                    .commit();
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onCreateView");
        FragmentLinearLayoutBinding binding = FragmentLinearLayoutBinding
                .inflate(inflater, container, false);

        TextView textView = binding.textView2;

        getParentFragmentManager().setFragmentResultListener(Constants.REQUEST_KEY,
        this, (requestKey, bundle) -> {
            String result = bundle.getString(Constants.BUNDLE_KEY);
            textView.setText(result);
        });


        Button button = binding.button2;
        button.setOnClickListener(view -> {
            Log.d(Constants.MY_TAG, "клик на кнопку на LinerLayoutActivity");
        });

        getChildFragmentManager()
            .setFragmentResultListener(Constants.CHILD_REQUEST_KEY, this, ((requestKey, result) -> {
                Log.e("AAA", "!!!");
                binding.textView2.setText(result.getString(Constants.BUNDLE_KEY));
            }));

        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w(Constants.MY_TAG, "LinearLayoutFragment onDestroy");
    }
}