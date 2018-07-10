package com.luisro00005513.pdmparcial3.ViewModels;


import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Retrofit.Models.LoginApi;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitService;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitServices;

import java.io.IOException;

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
    private RetrofitService retrofitService;
    public static String token;

    public static AppRepository getInstance(Application application) {
        if (INSTANCE == null) {
            INSTANCE = new AppRepository(application);
        }
        return INSTANCE;
    }


    //Instanciar database e instanciar retrofit
    private AppRepository(Application application) {
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("Authorization","Bearer " + token)
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();

        RetrofitServices retrofitServices = new RetrofitServices();
        retrofitServices.conectar();

    }

    //-------------------------GetToken---------------------
    public String getToken(String user, String pass){
        LoginApi login = new LoginApi("user","pass");
        Call<LoginApi> call = retrofitService.getToken(login);
        call.enqueue(new Callback<LoginApi>() {
            @Override
            public void onResponse(Call<LoginApi> call, Response<LoginApi> response) {
                if(response.isSuccessful()){
                    token = response.body().getToken();
                    Log.d("entro: ", "siiiiiii");
                }
            }
            @Override
            public void onFailure(Call<LoginApi> call, Throwable t) {
                //Toast.makeText(getContext(),"Fallo de conexion",Toast.LENGTH_SHORT).show();
                Log.d("entro: ", "siiiiiii");
            }
        });
        return token;
    }//getToken

}
