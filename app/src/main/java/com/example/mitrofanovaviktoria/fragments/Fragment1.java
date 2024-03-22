package com.example.mitrofanovaviktoria.fragments;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.mitrofanovaviktoria.Constants;
import com.example.mitrofanovaviktoria.MainActivity;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {
    private final String CHANNEL_ID = "channel_id_example_01";
    private final int notificationId = 101;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Channel Name";
            String description = "Channel Description";
            int importance = NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            NotificationManager notificationManager = (NotificationManager)requireContext()
                    .getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(channel);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Fragment1Binding binding = Fragment1Binding.inflate(getLayoutInflater());

        Bundle bundle = new Bundle();
        bundle.putString(Constants.BUNDLE_STRING_KEY, "Данные от первого фрагмента");

        binding.navButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_fragment1_to_fragment2,
                    bundle
            );
        });

        binding.showNotificationButton.setOnClickListener(view -> {

            NotificationCompat.Builder builder = new NotificationCompat.Builder(requireContext(), CHANNEL_ID)
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setContentTitle("Пример уведомления")
                    .setContentText("Это пример уведомления с текстом.")
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setAutoCancel(true);

            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(requireContext());
            if (ActivityCompat.checkSelfPermission(requireContext(), Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED)
                return;
            notificationManager.notify(notificationId, builder.build());
        });

        return binding.getRoot();
    }

}