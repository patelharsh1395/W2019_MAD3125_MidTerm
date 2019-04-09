package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.midtermmad3125.R;
import com.midtermmad3125.model.CustomAdapter;
import com.midtermmad3125.model.WeatherDetails;

import java.util.ArrayList;

public class WeatherListActivity extends AppCompatActivity
{


    ArrayList<WeatherDetails> weatherDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_list);

        Bundle mbundel = getIntent().getExtras();
       this.weatherDetails = (ArrayList<WeatherDetails>) mbundel.getSerializable("WeatherList");
        Log.e("))))))", this.weatherDetails.get(0).getDeg()+"");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CustomAdapter ca = new CustomAdapter(weatherDetails, this, new CustomAdapter.SetCustomOnclickListener() {
            @Override
            public void customOnclick(WeatherDetails weatherDetail) {
                Intent mIntent = new Intent(WeatherListActivity.this , WeatherDetails.class);
                mIntent.putExtra("weatherdetails" , weatherDetail);
                startActivity(mIntent);
            }
        });
        recyclerView.setAdapter(ca);


    }
}
