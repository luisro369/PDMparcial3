package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by UCA on 10/07/2018.
 */


@Dao
public interface UserDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserDB... userDBS);

    @Query("DELETE FROM UserDB")
    void DeleteAllUsers();

    @Delete
    void delete(UserDB userDB);

    @Update
    void update(UserDB... userDBS);

    //Sacar las cartas de los usuarios
    @Query("SELECT UserDB.firstName, UserDB.lastName,UserDB.phone_number  FROM CardDB INNER JOIN CollectionDB ON CardDB._id=CollectionDB.card_id INNER JOIN UserDB ON  " +
            "UserDB._id=CollectionDB.card_id WHERE  CardDB._id=:cardId")
    Flowable<List<UserDB>> getUsersForRepository(final int cardId);


}
