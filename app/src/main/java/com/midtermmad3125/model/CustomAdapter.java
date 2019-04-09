package com.midtermmad3125.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {




    interface  SetCustomOnclickListener{
        public void customOnclick(WeatherDetails weatherDetails);
    }

   ArrayList<WeatherDetails>  weatherDetails;
   Context con;







    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends  RecyclerView.ViewHolder{


        public ViewHolder(@NonNull View itemView) {
            super(itemView);





        }
    }
}
