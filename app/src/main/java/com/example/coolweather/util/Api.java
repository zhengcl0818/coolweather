package com.example.coolweather.util;



import com.example.coolweather.db.Province;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "http://guolin.tech/api/";

    @GET("china")
    Call<List<Province>> getsuperHeroes();
}

