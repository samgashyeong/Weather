package com.example.weather.data;

import java.util.ArrayList;

public class Data {
    Coord CoordObject;
    ArrayList< Weather > weather = new ArrayList<>();
    private String base;
    Main MainObject;
    private float visibility;
    Wind WindObject;
    Clouds CloudsObject;
    private float dt;
    Sys SysObject;
    private float timezone;
    private float id;
    private String name;
    private float cod;



    public Coord getCoord() {
        return CoordObject;
    }

    public String getBase() {
        return base;
    }
    public ArrayList<Weather> getWeather(){
        return weather;
    }

    public Main getMain() {
        return MainObject;
    }

    public float getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return WindObject;
    }

    public Clouds getClouds() {
        return CloudsObject;
    }

    public float getDt() {
        return dt;
    }

    public Sys getSys() {
        return SysObject;
    }

    public float getTimezone() {
        return timezone;
    }

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCod() {
        return cod;
    }


    public void setCoord(Coord coordObject) {
        this.CoordObject = coordObject;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMain(Main mainObject) {
        this.MainObject = mainObject;
    }
    public void setWeather(ArrayList<Weather> weather){
        this.weather = weather;
    }

    public void setVisibility(float visibility) {
        this.visibility = visibility;
    }

    public void setWind(Wind windObject) {
        this.WindObject = windObject;
    }

    public void setClouds(Clouds cloudsObject) {
        this.CloudsObject = cloudsObject;
    }

    public void setDt(float dt) {
        this.dt = dt;
    }

    public void setSys(Sys sysObject) {
        this.SysObject = sysObject;
    }

    public void setTimezone(float timezone) {
        this.timezone = timezone;
    }

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCod(float cod) {
        this.cod = cod;
    }
}