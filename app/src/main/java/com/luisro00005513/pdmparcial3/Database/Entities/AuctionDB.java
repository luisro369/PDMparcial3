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
                childColumns = "collection_id")
})

public class AuctionDB {

    @NonNull
    @PrimaryKey
    @ColumnInfo (name = "idauction")
    private long IdAuction;

    @ColumnInfo (name = "time")
    private String Time;

    @ColumnInfo (name = "initialprice")
    private String InitialPrice;

    @ColumnInfo(name = "FinalPrice")
    private String FinalPrice;

    public AuctionDB(long idAuction, String time, String initialPrice, String finalPrice) {
        IdAuction = idAuction;
        Time = time;
        InitialPrice = initialPrice;
        FinalPrice = finalPrice;
    }

    public long getIdAuction() {
        return IdAuction;
    }

    public void setIdAuction(long idAuction) {
        IdAuction = idAuction;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getInitialPrice() {
        return InitialPrice;
    }

    public void setInitialPrice(String initialPrice) {
        InitialPrice = initialPrice;
    }

    public String getFinalPrice() {
        return FinalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        FinalPrice = finalPrice;
    }
}
