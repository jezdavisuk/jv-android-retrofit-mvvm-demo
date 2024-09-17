package com.northcoders.jv_android_retrofit_mvvm_demo.service;

import com.northcoders.jv_android_retrofit_mvvm_demo.model.Fruit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET
    Call<List<Fruit>> getAllFruits();

}
