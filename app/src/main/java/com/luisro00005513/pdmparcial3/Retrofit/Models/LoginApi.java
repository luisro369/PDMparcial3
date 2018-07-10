package com.luisro00005513.pdmparcial3.Retrofit.Models;

/**
 *{@link LoginApi}
 * Clase para usar Java reactivex y guardar el Token
 */

public class LoginApi {
    private String user;
    private String password;
    private String token;

    public LoginApi(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
