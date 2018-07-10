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

    //constructor




    //======setter & getters==============
    public String get_Id() {
        return _Id;
    }

    public void set_Id(String _Id) {
        this._Id = _Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String get_id_album() {
        return _id_album;
    }

    public void set_id_album(String _id_album) {
        this._id_album = _id_album;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
