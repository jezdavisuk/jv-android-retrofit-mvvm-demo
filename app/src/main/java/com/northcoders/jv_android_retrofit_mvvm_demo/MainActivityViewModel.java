package com.northcoders.jv_android_retrofit_mvvm_demo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.northcoders.jv_android_retrofit_mvvm_demo.model.Fruit;
import com.northcoders.jv_android_retrofit_mvvm_demo.model.FruitRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private FruitRepository fruitRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.fruitRepository = new FruitRepository(application);
    }

    public LiveData<List<Fruit>> getAllFruit() {
        return fruitRepository.getMutableLiveData();
    }
}
