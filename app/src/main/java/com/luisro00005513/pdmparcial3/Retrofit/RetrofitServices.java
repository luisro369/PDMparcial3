package com.luisro00005513.pdmparcial3.Retrofit;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * {@link RetrofitServices}
 * Esta clase permite conectar retrofit con los servicios API e implementar los métodos de la interfaz en cualquier
 * parte del código.
 */

public class RetrofitServices{
    public static String token;
    public static final String BASE_URL = "https://xover-api.herokuapp.com";

    public RetrofitService conectar(){
        //--------------conexion retrofit--------------------
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder()
                        .addHeader("Authorization","Bearer " + token)
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();

        Retrofit.Builder buider = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = buider.build();
        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        return retrofitService;

        //--------------conexion retrofit--------------------
    }//conectar
 }
