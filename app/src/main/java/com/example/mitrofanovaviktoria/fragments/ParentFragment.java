package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentParentBinding;


public class ParentFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.MY_TAG, "ParentFragment onCreate");
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(
                            R.id.fragment_container_1,
                            ChildFragment.class,
                            null
                    )
                    .commit();

            getChildFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(
                            R.id.fragment_container_2,
                            ChildFragment2.class,
                            null
                    )
                    .commit();
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(Constants.MY_TAG, "ParentFragment onCreateView");
        FragmentParentBinding binding = FragmentParentBinding.inflate(getLayoutInflater());

        getChildFragmentManager()
                .setFragmentResultListener(Constants.CHILD_REQUEST_KEY, this, ((requestKey, result) -> {
                    binding.resultTextView.setText(result.getString(Constants.BUNDLE_KEY));
                }));

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(Constants.MY_TAG, "ParentFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(Constants.MY_TAG, "ParentFragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Constants.MY_TAG, "ParentFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(Constants.MY_TAG, "ParentFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Constants.MY_TAG, "ParentFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Constants.MY_TAG, "ParentFragment onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(Constants.MY_TAG, "ParentFragment onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(Constants.MY_TAG, "ParentFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Constants.MY_TAG, "ParentFragment onDestroy");
    }
}