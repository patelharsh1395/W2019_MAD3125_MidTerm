package com.midtermmad3125.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.midtermmad3125.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {




    public interface  SetCustomOnclickListener{
        public void customOnclick(WeatherDetails weatherDetails);
    }

   ArrayList<WeatherDetails>  weatherDetails;
   Context con;
    SetCustomOnclickListener listener;



    public CustomAdapter(ArrayList<WeatherDetails> weatherDetails, Context con, SetCustomOnclickListener listener) {
        this.weatherDetails = weatherDetails;
        this.con = con;
        this.listener = listener;
    }





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        LayoutInflater inflater = LayoutInflater.from(this.con);
        View view = inflater.inflate(R.layout.card_for_recyclerview,viewGroup , false );
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {



        Log.e("inside ONBIND","");
        viewHolder.bind(this.weatherDetails.get(i), this.listener);



    }

    @Override
    public int getItemCount() {
        return this.weatherDetails.size();
    }

    class ViewHolder extends  RecyclerView.ViewHolder{


        TextView date_time ;
        TextView minm;
        TextView maxm;
        TextView condition_main;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date_time = itemView.findViewById(R.id.text_date_time);
            minm = itemView.findViewById(R.id.text_min);
            maxm = itemView.findViewById(R.id.text_max);
            condition_main = itemView.findViewById(R.id.text_main);



        }


        public void bind(final WeatherDetails weatherDetails, final SetCustomOnclickListener listener)
        {
            date_time.setText(weatherDetails.getDt()+"");
            minm.setText(weatherDetails.getTemp().getMinm()+"");
            maxm.setText(weatherDetails.getTemp().getMaxm()+"");
            condition_main.setText(weatherDetails.getWeather().get(0).description);


            
        }
    }
}
