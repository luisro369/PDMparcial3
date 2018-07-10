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
public interface CardDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CardDB... cardDBS);

    @Query("DELETE FROM CardDB")
    void DeleteAllCards();

    @Delete
    void delete(CardDB cardDB);

    @Update
    void update(CardDB... cardDBS);


    //Sacar las cartas de los usuarios
    @Query("SELECT CardDB.`desc`, CardDB.image,CardDB.state ,CardDB.title, CardDB.type FROM UserDB INNER JOIN CollectionDB ON UserDB._id=CollectionDB.user_id INNER JOIN CardDB ON " +
            "CardDB._id=CollectionDB.card_id WHERE  UserDB._id=:userId")
    Flowable<List<CardDB>> getUsersForRepository(final int userId);

}
