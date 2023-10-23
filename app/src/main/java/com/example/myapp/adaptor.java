package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptor extends RecyclerView.Adapter <adaptor.ViewHolder>{
    Context context;
    ArrayList<contact> arrContacts;
    public adaptor(Context context, ArrayList<contact> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.activity_contact,parent, false);
        ViewHolder view = new ViewHolder(v);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(arrContacts.get(position).img);
        holder.rollNo.setText(arrContacts.get(position).rollNo);
        holder.name.setText(arrContacts.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, rollNo;
        ImageView img;
        public ViewHolder(View itemView){
            super(itemView);

            name = itemView.findViewById(R.id.rcname);
            rollNo= itemView.findViewById(R.id.rcrollno);
            img = itemView.findViewById(R.id.rcimage);
        }
    }
}