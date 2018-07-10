package com.luisro00005513.pdmparcial3.ViewModels;


import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Retrofit.Models.CardApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.LoginApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitService;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitServices;

import java.io.IOException;
import java.util.List;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * {@link AppRepository}
 * Global App Repository
 */


public class AppRepository {
    private static AppRepository INSTANCE;
    private RetrofitServices retrofitServices;
    public static String token;

    public static AppRepository getInstance(Application application) {
        if (INSTANCE == null) {
            INSTANCE = new AppRepository(application);
        }
        return INSTANCE;
    }


    //Instanciar database e instanciar retrofit
    private AppRepository(Application application) {
        retrofitServices = new RetrofitServices();
        retrofitServices.conectar();
    }

    //-------------------------GetToken---------------------
    public String getToken(String user, String pass){
        Single<LoginApi> login = retrofitServices.getRetrofitService().getToken(new LoginApi(user,pass))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

        login.subscribe((loginapi, throwable)-> {
            token = loginapi.getToken();
            Log.d("entro", token+"");
        });

        return token;
    }//getToken

    //=================metodo para extraer todos los usuarios=============================
    public Single<List<UserApi>> getUsers(){
        Single<List<UserApi>> userapi = retrofitServices.getRetrofitService().getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
        return userapi;
    }


    //=================metodo para extraer todos los cards=============================
    public List<CardApi> getCards(){
        Single<List<CardApi>> cardapi = retrofitServices.getRetrofitService().getCards()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
        /*Call<List<CardApi>> call = retrofitServices.getRetrofitService().getCards();
        List<CardApi> listCards = null;
        try {
            listCards = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return null;
    }



}
