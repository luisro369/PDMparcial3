package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by UCA on 10/07/2018.
 */
@Entity
public class CardDB {
    @PrimaryKey
    @ColumnInfo(name = "_id")
    private Long CardId;

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

    @ColumnInfo(name = "state")
    private String CardState;

    @ColumnInfo(name = "precio")
    private String Precio;

    public Long getCardId() {
        return CardId;
    }

    public void setCardId(Long cardId) {
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

    public String getCardState() {
        return CardState;
    }

    public void setCardState(String cardState) {
        CardState = cardState;
    }
}
