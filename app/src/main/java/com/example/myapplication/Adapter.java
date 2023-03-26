package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Model [] data_list;
    public Adapter(Model[] data_list) {
        this.data_list = data_list;

    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View list_item = layoutInflater.inflate(R.layout.item , null);
        ViewHolder view_holder =new ViewHolder(list_item);
        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model data_model = data_list[position];
        holder.img.setImageResource(data_model.getImage());
        holder.txt_description.setText(data_model.getDescription());
        holder.txt_title.setText(data_model.getTitle());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent= new Intent(view.getContext(),Data_activity.class);
                myintent.putExtra("title",data_model.getTitle());
                myintent.putExtra("Des",data_model.getDescription());
                myintent.putExtra("image",data_model.getImage());
                view.getContext().startActivity(myintent);
            }
        });
    }



    @Override
    public int getItemCount() {
      return data_list.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt_title, txt_description;
        CardView card;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_title =itemView.findViewById(R.id.id_txt_title);
            txt_description =itemView.findViewById(R.id.id_des);
            img =itemView.findViewById(R.id.id_image);
            card=itemView.findViewById(R.id.main_card);
        }
    }
}

