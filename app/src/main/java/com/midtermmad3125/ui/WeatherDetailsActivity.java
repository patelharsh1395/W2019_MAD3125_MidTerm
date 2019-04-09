package com.midtermmad3125.ui;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.model.WeatherDetails;

public class WeatherDetailsActivity extends AppCompatActivity
{

    WeatherDetails weatherDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waether_details);

        Bundle mBundle = this.getIntent().getExtras();
        this.weatherDetails = (WeatherDetails) mBundle.getSerializable("weatherdetails");

        TextView degree = findViewById(R.id.Degree);
        TextView pressure = findViewById(R.id.pressure);
        TextView humidity = findViewById(R.id.humidity);
        TextView speed = findViewById(R.id.speed);
        TextView cloud = findViewById(R.id.cloud);
        TextView rain = findViewById(R.id.rain);

        degree.setText("Degree : "+weatherDetails.getDeg());
        pressure.setText("Pressure : "+weatherDetails.getPressure());
        humidity.setText("Humidity :"+weatherDetails.getHumidity());
        speed.setText("Speed : "+weatherDetails.getSpeed());
        cloud.setText("Cloud : "+weatherDetails.getClouds());
        rain.setText("Rain : "+weatherDetails.getRain());




    }
}
