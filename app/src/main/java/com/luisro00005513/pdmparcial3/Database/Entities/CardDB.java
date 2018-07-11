package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import io.reactivex.annotations.NonNull;

/**
 * Created by UCA on 10/07/2018.
 */
@Entity(foreignKeys = {
        @ForeignKey(entity = AlbumDB.class,
                parentColumns = "_id",
                childColumns = "id_album")
})
public class CardDB {
    @PrimaryKey
    @ColumnInfo(name = "_id")
    @android.support.annotation.NonNull
    private String CardId;

    @ColumnInfo(name = "title")
    private String CardTitle;

    @ColumnInfo(name = "image")
    private String CardImage;

    @ColumnInfo(name = "desc")
    private String CardDesc;

    @ColumnInfo(name = "id_album")
    private Long IdAlbum;

    @ColumnInfo(name = "type")
    private String CardType;

    @ColumnInfo(name = "rarity")
    private String Rarity;

    @ColumnInfo(name = "base_price")
    private String BasePrice;

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public String getCardTitle() {
        return CardTitle;
    }

    public void setCardTitle(String cardTitle) {
        CardTitle = cardTitle;
    }

    public String getCardImage() {
        return CardImage;
    }

    public void setCardImage(String cardImage) {
        CardImage = cardImage;
    }

    public String getCardDesc() {
        return CardDesc;
    }

    public void setCardDesc(String cardDesc) {
        CardDesc = cardDesc;
    }

    public Long getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(Long idAlbum) {
        IdAlbum = idAlbum;
    }

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public String getRarity() {
        return Rarity;
    }

    public String getBasePrice() {
        return BasePrice;
    }

    public void setRarity(String rarity) {
        Rarity = rarity;
    }

    public void setBasePrice(String basePrice) {
        BasePrice = basePrice;
    }
}
