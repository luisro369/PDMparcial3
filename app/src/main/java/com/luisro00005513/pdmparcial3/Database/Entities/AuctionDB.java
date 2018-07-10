package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Karla on 10/7/2018.
 */

@Entity
public class AuctionDB {

    @PrimaryKey
    @ColumnInfo (name = "IdAuction")
    private long idauction;

    @ColumnInfo (name = "Time")
    private String time;

    @ColumnInfo (name = "InitialPrice")
    private String initialprice;

    @ColumnInfo(name = "FinalPrice")
    private String finalprice;

    public AuctionDB(long idauction, String time, String initialprice, String finalprice) {
        this.idauction = idauction;
        this.time = time;
        this.initialprice = initialprice;
        this.finalprice = finalprice;
    }

    public long getIdauction() {
        return idauction;
    }

    public void setIdauction(long idauction) {
        this.idauction = idauction;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInitialprice() {
        return initialprice;
    }

    public void setInitialprice(String initialprice) {
        this.initialprice = initialprice;
    }

    public String getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(String finalprice) {
        this.finalprice = finalprice;
    }
}
