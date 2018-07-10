package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by UCA on 10/07/2018.
 */
@Entity
public class UserDB {
    @NonNull
    @PrimaryKey
    @ColumnInfo (name = "_id")
    private long Id;
    @ColumnInfo (name = "username")
    private String Username;
}
