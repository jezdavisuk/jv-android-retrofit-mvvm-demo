package com.northcoders.jv_android_retrofit_mvvm_demo.model;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import com.northcoders.jv_android_retrofit_mvvm_demo.service.ApiService;
import com.northcoders.jv_android_retrofit_mvvm_demo.service.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;
import java.util.Objects;

public class FruitRepository {

    private MutableLiveData<List<Fruit>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public FruitRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Fruit>> getMutableLiveData() {
        ApiService apiService = RetrofitInstance.getService();
        Call<List<Fruit>> call = apiService.getAllFruits();

        call.enqueue(new Callback<List<Fruit>>() {
            @Override
            public void onResponse(Call<List<Fruit>> call, Response<List<Fruit>> response) {
                List<Fruit> fruits = response.body();
                mutableLiveData.setValue(fruits);
            }

            @Override
            public void onFailure(Call<List<Fruit>> call, Throwable throwable) {
                Log.i("HTTP Failure", Objects.requireNonNull(throwable.getMessage()));
            }
        });

        return mutableLiveData;
    }
}
