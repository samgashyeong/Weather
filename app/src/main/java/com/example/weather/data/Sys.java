package com.example.weather.data;

public class Sys {
    private float type;
    private float id;
    private String country;
    private float sunrise;
    private float sunset;



    public float getType() {
        return type;
    }

    public float getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public float getSunrise() {
        return sunrise;
    }

    public float getSunset() {
        return sunset;
    }


    public void setType(float type) {
        this.type = type;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(float sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(float sunset) {
        this.sunset = sunset;
    }
}
