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
public interface UserDAO {
    @Insert
    void insert(UserDB userRepoJoin);

    //Sacar las cartas de los usuarios
    @Query("SELECT CardDB.`desc`, CardDB.image,CardDB.state ,CardDB.title, CardDB.type FROM UserDB INNER JOIN CollectionDB ON UserDB._id=CollectionDB.user_id INNER JOIN CardDB ON " +
            "CardDB._id=CollectionDB.card_id WHERE  UserDB._id=:userId")
    List<UserDB> getUsersForRepository(final int userId);


}
