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

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<CardDB> cardDBS);

    @Query("DELETE FROM CardDB")
    void DeleteAllCards();

    @Delete
    void delete(CardDB... cardDB);

    @Delete
    void delete(List<CardDB> cardDB);

    @Update
    void update(CardDB... cardDBS);


    //Sacar las cartas segun un usuario
    @Query("SELECT CardDB.* FROM UserDB INNER JOIN CollectionDB ON UserDB._id=CollectionDB.user_id INNER JOIN CardDB ON " +
            "CardDB._id=CollectionDB.card_id WHERE  UserDB._id=:userId")
    Flowable<List<CardDB>> getCardsByUser(final String userId);

    //Sacar las cartas segun un usuario y un album
    @Query("SELECT CardDB.* FROM UserDB INNER JOIN CollectionDB ON UserDB._id=CollectionDB.user_id INNER JOIN CardDB ON " +
            "CardDB._id=CollectionDB.card_id WHERE  UserDB._id=:userId AND CardDB.id_album=:albumid")
    Flowable<List<CardDB>> getCardsByUserAlbum(final String userId, final String albumid);

    //Sacar cartas segun un album
    @Query("SELECT * FROM CardDB WHERE CardDB.id_album=:albumid")
    Flowable<List<CardDB>> getCardsByAlbum(final String albumid);
}
