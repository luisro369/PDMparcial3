package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Karla on 10/7/2018.
 */

@Entity
public class SubastaDB {

    @PrimaryKey
    @ColumnInfo (name = "IdSubasta")
    private long idSubasta;

    @ColumnInfo (name = "Tiempo")
    private String tiempo;

    @ColumnInfo (name = "PrecioInicial")
    private String precioinicial;

    @ColumnInfo(name = "PrecioFinal")
    private String preciofinal;

    public SubastaDB(long idSubasta, String tiempo, String precioinicial, String preciofinal) {
        this.idSubasta = idSubasta;
        this.tiempo = tiempo;
        this.precioinicial = precioinicial;
        this.preciofinal = preciofinal;
    }

    public long getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(long idSubasta) {
        this.idSubasta = idSubasta;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPrecioinicial() {
        return precioinicial;
    }

    public void setPrecioinicial(String precioinicial) {
        this.precioinicial = precioinicial;
    }

    public String getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(String preciofinal) {
        this.preciofinal = preciofinal;
    }
}
