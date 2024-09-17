package com.northcoders.jv_android_retrofit_mvvm_demo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.northcoders.jv_android_retrofit_mvvm_demo.model.FruitRepository;

public class MainActivityViewModel extends AndroidViewModel {

    private FruitRepository fruitRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.fruitRepository = new FruitRepository(application);
    }

}
