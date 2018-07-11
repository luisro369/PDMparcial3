package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import retrofit2.http.Field;




@Entity
public class AlbumDB {

    @PrimaryKey
    @NonNull
    @ColumnInfo (name="_id")
    private String idAlbum;

    @ColumnInfo (name = "album_name")
    private String albumName;
    @ColumnInfo (name ="game")
    private String game;

    @NonNull
    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(@NonNull String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setNombreAlbum(String albumName) {
        this.albumName = albumName;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String gamename) {
        game = gamename;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
