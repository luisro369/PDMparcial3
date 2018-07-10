package com.luisro00005513.pdmparcial3.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.luisro00005513.pdmparcial3.Retrofit.Models.CardApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;

import java.util.List;

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
    //------------------getToken-----------------
    public String token(String user, String password){
        return mRepository.getToken(user, password);
    }

    //------------------getUsers-------------------
    public List<UserApi> users(){
        return mRepository.getUsers();
    }

    //------------------getUsers-------------------
    public List<CardApi> cards(){
        return mRepository.getCards();
    }




}//appviewmodel
