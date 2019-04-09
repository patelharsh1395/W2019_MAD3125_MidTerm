package com.midtermmad3125.model;

import java.util.ArrayList;

public class RootElementJson {
    City city;
    ArrayList<WeatherDetails> list;

    public RootElementJson(City city, ArrayList<WeatherDetails> list) {
        this.city = city;
        this.list = list;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<WeatherDetails> getList() {
        return list;
    }

    public void setList(ArrayList<WeatherDetails> list) {
        this.list = list;
    }
}
