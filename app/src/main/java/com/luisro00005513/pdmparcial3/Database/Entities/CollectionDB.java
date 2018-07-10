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
                parentColumns = "_id",
                childColumns = "user_id"),
        @ForeignKey(entity = CardDB.class,
                parentColumns = "_id",
                childColumns = "card_id")
})

public class CollectionDB {
    @PrimaryKey (autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "_id1")
    private String Id1;

    @ColumnInfo(name = "user_id")
    private String UserId;
    @ColumnInfo(name = "card_id")
    private String CardId;
    @ColumnInfo (name = "state")
    private String State;

    @NonNull
    public String getId1() {
        return Id1;
    }

    public String getUserId() {
        return UserId;
    }

    public String getCardId() {
        return CardId;
    }

    public void setId1(@NonNull String id1) {
        Id1 = id1;
    }


    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
