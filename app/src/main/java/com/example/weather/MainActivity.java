package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weather.data.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    TextView weahterTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weahterTV = findViewById(R.id.weatherTv);

        getWeatherData();
    }

    private void getWeatherData() {
        new Thread(() -> {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            Weather weather = retrofit.create(Weather.class);
            weather.getData().enqueue(new Callback<Data>() {
                @Override
                public void onResponse(Call<Data> call, Response<Data> response) {
                    assert response.body() != null;
                    Log.d(TAG, "onResponse:"+response.body().getWeather());
                    runOnUiThread(()->{
                        weahterTV.setText(response.body().getWeather().get(0).getMain());
                    });
                }

                @Override
                public void onFailure(Call<Data> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "불러오는데에 오류가 발생", Toast.LENGTH_SHORT).show();
                }
            });
        }).start();
    }

}