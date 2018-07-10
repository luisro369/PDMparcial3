package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by Karla on 10/7/2018.
 */

@Entity(foreignKeys = {
        @ForeignKey(entity = CollectionDB.class,
                parentColumns = "_id1",
                childColumns = "collection_id1")
})

public class ExchangeDB {

    @NonNull
    @PrimaryKey
    @ColumnInfo (name = "idexchange")
    private long IdExchange;

    @ColumnInfo (name = "estado")
    private String Estado;

    public ExchangeDB(long idExchange, String estado) {
        IdExchange = idExchange;
        Estado = estado;
    }

    public long getIdExchange() {
        return IdExchange;
    }

    public void setIdExchange(long idExchange) {
        IdExchange = idExchange;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
