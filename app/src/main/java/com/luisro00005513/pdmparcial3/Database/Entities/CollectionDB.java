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
    @ColumnInfo(name = "_id")
    private long Id;
    @ColumnInfo(name = "user_id")
    private long UserId;
    @ColumnInfo(name = "card_id")
    private long CardId;
    @ColumnInfo (name = "state")
    private String State;

    @NonNull
    public long getId() {
        return Id;
    }

    public long getUserId() {
        return UserId;
    }

    public long getCardId() {
        return CardId;
    }

    public String getState() {
        return State;
    }

    public void setId(@NonNull long id) {
        Id = id;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public void setCardId(long cardId) {
        CardId = cardId;
    }

    public void setState(String state) {
        State = state;
    }
}
