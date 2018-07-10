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
        LoginApi login = new LoginApi(user,pass);
        Call<LoginApi> call = retrofitServices.getRetrofitService().getToken(login);
        call.enqueue(new Callback<LoginApi>() {
            @Override
            public void onResponse(Call<LoginApi> call, Response<LoginApi> response) {
                if(response.isSuccessful()){
                    token = response.body().getToken();
                    Log.d("entro", "siiiiiii");
                    Log.d("entro", token+"");

                }
            }
            @Override
            public void onFailure(Call<LoginApi> call, Throwable t) {
                //Toast.makeText(getContext(),"Fallo de conexion",Toast.LENGTH_SHORT).show();
                Log.d("entro", "noooo");
            }
        });
        return token;
    }//getToken

    //=================metodo para extraer todos los usuarios=============================
    public List<UserApi> getUsers(){
        Call<List<UserApi>> call = retrofitServices.getRetrofitService().getUsers();
        List<UserApi> listUsers = null;
        try {
            listUsers = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listUsers;
    }


    //=================metodo para extraer todos los cards=============================
    public List<CardApi> getCards(){
        Call<List<CardApi>> call = retrofitServices.getRetrofitService().getCards();
        List<CardApi> listCards = null;
        try {
            listCards = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listCards;
    }



}
