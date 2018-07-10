package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity
public class AuctionDB {
    @PrimaryKey
    @ColumnInfo(name = "_id")
    private Long AuctionId;

    @ColumnInfo(name = "auction_finish")
    private Date AuctionFinish;

    @ColumnInfo(name = "starting_price")
    private Double StartingPrice;

    @ColumnInfo(name = "ending_price")
    private Double EndingPrice;

    @ColumnInfo(name = "auction_winnneid")
    private Long AuctionWinnerId;

    public Long getAuctionId() {
        return AuctionId;
    }

    public void setAuctionId(Long auctionId) {
        AuctionId = auctionId;
    }

    public Date getAuctionFinish() {
        return AuctionFinish;
    }

    public void setAuctionFinish(Date auctionFinish) {
        AuctionFinish = auctionFinish;
    }

    public Double getStartingPrice() {
        return StartingPrice;
    }

    public void setStartingPrice(Double startingPrice) {
        StartingPrice = startingPrice;
    }

    public Double getEndingPrice() {
        return EndingPrice;
    }

    public void setEndingPrice(Double endingPrice) {
        EndingPrice = endingPrice;
    }

    public Long getAuctionWinnerId() {
        return AuctionWinnerId;
    }

    public void setAuctionWinnerId(Long auctionWinnerId) {
        AuctionWinnerId = auctionWinnerId;
    }
}
