package com.luisro00005513.pdmparcial3.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.luisro00005513.pdmparcial3.Database.DAO.AlbumDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.CardDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.CollectionDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.UserDAO;
import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

/*
 * Created by UCA on 10/07/2018.
 */

@Database(entities = {AlbumDB.class, CardDB.class, CollectionDB.class, UserDB.class},version = 2)
public abstract class AppRoomDatabase extends RoomDatabase {
    private static final String DB_NAME = "PDM3.db";
    private static volatile AppRoomDatabase instance;

    public static synchronized AppRoomDatabase getInstance(Context context){
        if (instance == null){
            instance = create(context);
        }
        return instance;
    }

    private static AppRoomDatabase create(Context context) {
        return Room.databaseBuilder(
                context,
                AppRoomDatabase.class,
                DB_NAME
        ).build();
    }

    public abstract AlbumDAO albumDAO();
    public abstract CardDAO cardDAO();
    public abstract UserDAO userDAO();
}