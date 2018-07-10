package com.luisro00005513.pdmparcial3.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.luisro00005513.pdmparcial3.Database.DAO.AlbumDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.CardDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.CollectionDAO;
import com.luisro00005513.pdmparcial3.Database.DAO.UserDAO;
import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

/**
 * Created by UCA on 10/07/2018.
 */
@Database(entities = {AlbumDB.class, CardDB.class, CollectionDB.class, UserDB.class},version = 1)
public abstract class AppRoomDatabase extends RoomDatabase{
    public abstract AlbumDAO albumDAO();
    public abstract CardDAO cardDAO();
    public abstract CollectionDAO collectionDAo();
    public abstract UserDAO userDAO();

}
