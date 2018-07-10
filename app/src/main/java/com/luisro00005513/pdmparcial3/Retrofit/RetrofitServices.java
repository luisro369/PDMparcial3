package com.luisro00005513.pdmparcial3.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by luisro on 7/10/18.
 */
public class RetrofitServices{
    //public static final String BASE_URL = "http://localhost:3000";
    //public static final String BASE_URL = "http://192.168.0.28:3000";//wifi
    //public static final String BASE_URL = "http://192.168.0.46:3000";//cable ethernet
    public static final String BASE_URL = "https://xover-api.herokuapp.com";

    public RetrofitService conectar(){
        //--------------conexion retrofit--------------------


        Retrofit.Builder buider = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = buider.build();
        RetrofitService retrofitService = retrofit.create(RetrofitService.class);
        return retrofitService;

        //--------------conexion retrofit--------------------
    }//conectar
 }
