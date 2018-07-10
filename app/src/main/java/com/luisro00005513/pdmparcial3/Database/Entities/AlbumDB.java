package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import retrofit2.http.Field;

/**
 * Created by UCA on 10/07/2018.
 */
@Entity
public class AlbumDB {

    @PrimaryKey
    @NonNull
    @ColumnInfo (name="_id")
    private long idAlbum;

    @ColumnInfo (name = "nombre_album")
    private String nombreAlbum;
    @ColumnInfo (name ="id_juego")
    private long IdJuego;

    @NonNull
    public long getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(@NonNull long idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public long getIdJuego() {
        return IdJuego;
    }

    public void setIdJuego(long idJuego) {
        IdJuego = idJuego;
    }
}
