package com.luisro00005513.pdmparcial3.Retrofit;

import com.luisro00005513.pdmparcial3.Retrofit.Models.LoginApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by luisro on 7/10/18.
 */

//===========Esta interface nos va a ayudar con retrofit======

public interface RetrofitService {
    //metodo para poder logearme a la api
    @POST("/login")
    public Call<LoginApi> getToken(@Body LoginApi login);


}
