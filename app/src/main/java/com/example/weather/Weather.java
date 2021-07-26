package com.example.weather;

import com.example.weather.data.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Weather {
    @GET("/data/2.5/weather?q=Seoul&appid=03bc734cbfed390429669597db46ff2e")
    Call<Data> getData();
}
