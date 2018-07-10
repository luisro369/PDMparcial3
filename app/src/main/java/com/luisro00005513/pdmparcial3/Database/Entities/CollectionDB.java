package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by UCA on 10/07/2018.
 */

@Entity(foreignKeys = {
        @ForeignKey(entity = UserDB.class,
        parentColumns = "Id",
        childColumns = "UserIds"),
        @ForeignKey(entity = CardDB.class,
        parentColumns = "Id",
        childColumns = "CardIds")})
public class CollectionDB {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "Id")
    private long Id;
    @ColumnInfo(name = "userids")
    private String UserIds;
    @ColumnInfo (name = "cardids")
    private String CardIds;

    @NonNull
    public long getId() {
        return Id;
    }

    public String getUserIds() {
        return UserIds;
    }

    public String getCardIds() {
        return CardIds;
    }

    public void setId(@NonNull long id) {
        Id = id;
    }

    public void setUserIds(String userIds) {
        UserIds = userIds;
    }

    public void setCardIds(String cardIds) {
        CardIds = cardIds;
    }
}
