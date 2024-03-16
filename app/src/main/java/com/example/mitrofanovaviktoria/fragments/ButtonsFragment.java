package com.example.mitrofanovaviktoria.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.FragmentButtonsBinding;

public class ButtonsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentButtonsBinding binding = FragmentButtonsBinding.inflate(getLayoutInflater());

//        binding.goToListViewFragmentButton.setOnClickListener(view -> {
//            requireActivity().getSupportFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(
//                            R.id.fragment_container,
//                            ListFragment.class,
//                            null
//                    )
//                    .addToBackStack(null)
//                    .commit();
//        });
//
//        binding.goToRecycleViewFragmentButton.setOnClickListener(view -> {
//            requireActivity().getSupportFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .replace(
//                            R.id.fragment_container,
//                            RecyclerFragment.class,
//                            null
//                    )
//                    .addToBackStack(null)
//                    .commit();
//        });

        return binding.getRoot();
    }
}