package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.reflect.TypeToken;
import com.midtermmad3125.R;
import com.midtermmad3125.model.City;
import com.midtermmad3125.model.RootElementJson;
import com.midtermmad3125.model.WeatherDetails;
import com.midtermmad3125.utils.ReadJSONUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class MainCityActivity extends AppCompatActivity
{
    RootElementJson jr;
    ArrayList<WeatherDetails> weatherDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        String JsonString =   ReadJSONUtils.loadJSONFromAsset(this , "moscow_weather.json" );
        if(JsonString != null)
        {



            Gson gson = new Gson();

            Type type = new TypeToken<RootElementJson>() {}.getType();
            this.jr = gson.fromJson(JsonString , type);


            City city =(City) this.jr.getCity();
            this.weatherDetails = this.jr.getList();

            TextView city_text = findViewById(R.id.city_name);
            city_text.setText(city.getName());

            TextView latitude = findViewById(R.id.latitude);
            latitude.setText("Latitude : " +city.getCoord().getLat());


            TextView longitude = findViewById(R.id.longitude);
            longitude.setText("Longitude : "+city.getCoord().getLon());


            TextView population = findViewById(R.id.population);
            population.setText("Population : "+city.getPopulation());






        }
        else
        {
            Log.e("********* NULL *******","JSON not found");
        }





    }

    public void onClickBtn(View view)
    {
        Intent mIntent = new Intent(MainCityActivity.this , WeatherListActivity.class);
        mIntent.putExtra("WeatherList" , this.weatherDetails);
        startActivity(mIntent);
    }




    




}
