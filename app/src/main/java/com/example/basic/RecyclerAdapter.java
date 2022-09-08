package com.example.basic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    Context context;
    ArrayList<MyData> data;

    RecyclerAdapter(Context context, ArrayList<MyData> data){
        this.context = context;
        this.data=data;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main2,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        MyData curData = data.get(position);
        holder.title.setText(curData.getTitle());
        holder.message.setText(curData.getMessage());
        Picasso.get().load(curData.getUrl().
                ).into(holder.img);
        //Picasso.get().load(R.drawable.profilepicture).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView title;
        TextView message;

        public RecyclerViewHolder(@NonNull View view) {
            super(view);

            img = view.findViewById(R.id.img);
            title = view.findViewById(R.id.title);
            message = view.findViewById(R.id.name);
        }
    }

}
