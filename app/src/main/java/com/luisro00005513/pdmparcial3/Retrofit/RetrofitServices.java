package com.luisro00005513.pdmparcial3.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * {@link RetrofitServices}
 * Esta clase permite conectar retrofit con los servicios API e implementar los métodos de la interfaz en cualquier
 * parte del código.
 */

public class RetrofitServices{
    public static final String BASE_URL = "https://gamenewsuca.herokuapp.com";
    //public static final String BASE_URL = "https://xover-api.herokuapp.com";

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
