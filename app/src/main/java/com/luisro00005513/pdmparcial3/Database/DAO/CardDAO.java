package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

import java.util.List;

/**
 * Created by UCA on 10/07/2018.
 */

@Dao
public interface CardDAO {

    @Insert
    void insert(UserDB userRepoJoin);

    //Sacar las cartas de los usuarios
    @Query("SELECT UserDB.firstName, UserDB.lastName,UserDB.phone_number  FROM CardDB INNER JOIN CollectionDB ON CardDB._id=CollectionDB.card_id INNER JOIN UserDB ON  " +
            "UserDB._id=CollectionDB.card_id WHERE  CardDB._id=:cardId")
    List<UserDB> getUsersForRepository(final int cardId);
}
