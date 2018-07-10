package com.luisro00005513.pdmparcial3.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

/**
 * {@link AppViewModel}
 * Global App Repository
 */

public class AppViewModel extends AndroidViewModel {
    private AppRepository mRepository;

    public AppViewModel(@NonNull Application application) {
        super(application);
        mRepository = AppRepository.getInstance(application);
    }


    //TODOS LOS METODOS DE API Y BASE DE DATOS



}
