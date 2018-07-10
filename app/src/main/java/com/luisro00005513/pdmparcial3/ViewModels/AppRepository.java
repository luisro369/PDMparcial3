package com.luisro00005513.pdmparcial3.ViewModels;


import android.app.Application;

import com.luisro00005513.pdmparcial3.Retrofit.RetrofitService;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitServices;

/**
 * {@link AppRepository}
 * Global App Repository
 */


public class AppRepository {
    private static AppRepository INSTANCE;
    private RetrofitService retrofitService;


    public static AppRepository getInstance(Application application) {
        if (INSTANCE == null) {
            INSTANCE = new AppRepository(application);
        }
        return INSTANCE;
    }


    //Instanciar database e instanciar retrofit
    private AppRepository(Application application) {
        RetrofitServices retrofitServices = new RetrofitServices();
        retrofitServices.conectar();

    }

    //* Metodos principales**
    
}
