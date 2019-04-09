package com.midtermmad3125.model;


     "morn": 10.35


import java.io.Serializable;

public class Temperature implements Serializable {

    float minm;
    float maxm;
    float night;
    float morn;
    float eve;


    public float getMinm() {
        return minm;
    }

    public void setMinm(float minm) {
        this.minm = minm;
    }

    public float getMaxm() {
        return maxm;
    }

    public void setMaxm(float maxm) {
        this.maxm = maxm;
    }

    public float getNight() {
        return night;
    }

    public void setNight(float night) {
        this.night = night;
    }

    public float getMorn() {
        return morn;
    }

    public void setMorn(float morn) {
        this.morn = morn;
    }

    public float getEve() {
        return eve;
    }

    public void setEve(float eve) {
        this.eve = eve;
    }
}
