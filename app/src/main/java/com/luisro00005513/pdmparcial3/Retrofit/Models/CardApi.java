package com.luisro00005513.pdmparcial3.Retrofit.Models;

/**
 * Created by luisro on 7/10/18.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardApi {

    @SerializedName("_id")
    @Expose
    private String _Id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("_id_album")
    @Expose
    private String _id_album;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("quality")
    @Expose
    private String quality;



}
