package com.example.mitrofanovaviktoria.adapters;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mitrofanovaviktoria.R;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private final ArrayList<String> data;
    private final Context context;

    public MyRecyclerAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = data.get(position);
        holder.text.setText(item);
        holder.image.setImageDrawable(context.getDrawable(R.drawable.baseline_account_balance_24));
        holder.layout.setOnClickListener(view -> {
            Toast.makeText(context, "нажатие на элемент recycler view", Toast.LENGTH_SHORT).show();
        });
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