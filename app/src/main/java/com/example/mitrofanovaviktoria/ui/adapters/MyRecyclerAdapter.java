package com.example.mitrofanovaviktoria.ui.adapters;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mitrofanovaviktoria.domain.Constants;
import com.example.mitrofanovaviktoria.R;
import com.example.mitrofanovaviktoria.data.User;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private ArrayList<User> data;
    private final Context context;

    public MyRecyclerAdapter(ArrayList<User> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User item = data.get(position);
        holder.text.setText(item.firstName + "  " + item.secondName + "  Age" + item.age);
        holder.image.setImageDrawable(context.getDrawable(R.drawable.baseline_account_balance_24));

        Bundle bundle = new Bundle();
        bundle.putInt(Constants.BUNDLE_ID_KEY, item.id);
        holder.layout.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(
                    R.id.action_listFragment_to_detailsFragment,
                    bundle
            );
        });
    }

    @SuppressLint("NotifyDataSetChanged")
    public void updateData(ArrayList<User> newData) {
        data = new ArrayList<>(newData);
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text;
        public ImageView image;
        public ViewGroup layout;

        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.list_item_text_view);
            image = itemView.findViewById(R.id.list_item_image_view);
            layout = itemView.findViewById(R.id.item_root_container);
        }
    }
}