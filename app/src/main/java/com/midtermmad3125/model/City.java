package com.midtermmad3125.model;


//"city": {
//        "id": 524901,
//        "name": "Moscow",
//        "coord": {
//        "lon": 37.6177,
//        "lat": 55.7507
//        },
//        "country": "RU",
//        "population": 1000000
//        },


import java.io.Serializable;
import java.util.ArrayList;

public class City  {

    String name;
    String country;
    Coordinates coord;
    String population;


    public City(String name, String country, String population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
