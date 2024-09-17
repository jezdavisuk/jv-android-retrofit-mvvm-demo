package com.northcoders.jv_android_retrofit_mvvm_demo.model;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import java.util.List;

public class FruitRepository {

    private MutableLiveData<List<Fruit>> mtld = new MutableLiveData<>();
    private Application application;

    public FruitRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Fruit>> getMutableLiveData() {

    }
}
