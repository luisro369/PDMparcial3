package com.luisro00005513.pdmparcial3.Retrofit;

import com.luisro00005513.pdmparcial3.Retrofit.Models.CardApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.LoginApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by luisro on 7/10/18.
 */

//===========Esta interface nos va a ayudar con retrofit======

public interface RetrofitService {
    //metodo para poder logearme a la api
    @POST("/login")
    public Call<LoginApi> getToken(@Body LoginApi login);


    //metodo para poder extraer usuarios de la api
    @GET("/users")
    public Call<List<UserApi>> getUsers();

    //metodo para poder extraer Cartas de la api
    @GET("/users")
    public Call<List<CardApi>> getCards();


}
