package com.example.mitrofanovaviktoria.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constants.MY_TAG, "MainFragment onCreate");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(Constants.MY_TAG, "MainFragment onCreateView");
        FragmentMainBinding binding = FragmentMainBinding.inflate(inflater, container, false);

        binding.linearButton.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString(Constants.BUNDLE_KEY, "Результат от фрагмента MainFragment");
            getParentFragmentManager().setFragmentResult(
                    Constants.REQUEST_KEY, result);
//            getParentFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(
//                            R.id.fragment_container,
//                            LinearLayoutFragment.class,
//                            null
//                    )
//                    .addToBackStack(null)
//                    .commit();
        });

//        binding.relativeButton.setOnClickListener(view -> {
//            requireActivity().getSupportFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(
//                            R.id.fragment_container,
//                            RelativeLayoutFragment.class,
//                            null
//                    )
//                    .addToBackStack(null)
//                    .commit();
//        });
//
//        binding.constraintButton.setOnClickListener(view -> {
//            requireActivity().getSupportFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(
//                            R.id.fragment_container,
//                            ConstraintLayoutFragment.class,
//                            null
//                    )
//                    .addToBackStack(null)
//                    .commit();
//        });



        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(Constants.MY_TAG, "MainFragment onViewCreated");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.d(Constants.MY_TAG, "MainFragment onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(Constants.MY_TAG, "MainFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(Constants.MY_TAG, "MainFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Constants.MY_TAG, "MainFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Constants.MY_TAG, "MainFragment onStop");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(Constants.MY_TAG, "MainFragment onSaveInstanceState");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(Constants.MY_TAG, "MainFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Constants.MY_TAG, "MainFragment onDestroy");
    }
}