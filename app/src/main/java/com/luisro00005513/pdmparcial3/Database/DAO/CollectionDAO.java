package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by UCA on 10/07/2018.
 */

@Dao
public interface CollectionDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CollectionDB... news);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<CollectionDB> news);

    @Query("SELECT * FROM CollectionDB WHERE user_id = :userId")
    Flowable<List<CollectionDB>> getUserCollections(String userId);

    @Query("DELETE FROM CollectionDB")
    void DeleteAllCollection();

    @Delete
    void delete(CollectionDB... collectionDB);
    @Delete
    void delete(List<CollectionDB> collectionDB);

    @Update
    void update(CollectionDB... collectionDB);
    @Update
    void update(List<CollectionDB> collectionDB);
}
