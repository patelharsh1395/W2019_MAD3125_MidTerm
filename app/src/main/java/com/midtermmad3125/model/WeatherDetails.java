package com.midtermmad3125.model;

//"list": [
//        {
//        "dt": 1554714000,
//        "temp": {
//        "day": 10.35,
//        "min": 10.35,
//        "max": 10.35,
//        "night": 10.35,
//        "eve": 10.35,
//        "morn": 10.35
//        },
//        "pressure": 1013.11,
//        "humidity": 90,
//        "weather": [
//        {
//        "id": 500,
//        "main": "Rain",
//        "description": "light rain",
//        "icon": "10d"
//        }
//        ],
//        "speed": 5.44,
//        "deg": 184,
//        "clouds": 92,
//        "rain": 2.44
//        },
//
//


import java.io.Serializable;
import java.util.ArrayList;

public class WeatherDetails implements Serializable
{
    int dt;
    Temperature temp;
    float pressure;
    float humidity;
    ArrayList<Weather> weather;
    float speed;
    float deg;
    float rain;

    public float getClouds() {
        return clouds;
    }

    public void setClouds(float clouds) {
        this.clouds = clouds;
    }

    float clouds;




    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }




    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }



    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public float getRain() {
        return rain;
    }

    public void setRain(float rain) {
        this.rain = rain;
    }
}
