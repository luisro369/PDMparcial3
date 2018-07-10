package com.luisro00005513.pdmparcial3.Retrofit.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * {@link UserApi}
 * Modelo de User de la API
 */

public class UserApi {

    @SerializedName("_id")
    @Expose
    private String _Id;

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("firstName")
    @Expose
    private String firstName;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("phone")
    @Expose
    private String phone;

    @SerializedName("lastName")
    @Expose
    private String lastName;

}
