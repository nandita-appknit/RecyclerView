package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.concurrent.FutureTask;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private List<String> list;


    public recyclerAdapter(List<String> list){
        this.list=list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView= (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.text_view,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(textView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.versions.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
    private TextView versions;
        public MyViewHolder(@NonNull TextView itemView) {
            super(itemView);
            versions=itemView;
        }
    }
}
