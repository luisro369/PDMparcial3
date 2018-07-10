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

/**
 * Created by UCA on 10/07/2018.
 */

@Dao
public interface CollectionDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(CollectionDB... news);

    @Query("DELETE FROM CollectionDB")
    void DeleteAllCollection();

    @Delete
    void delete(CollectionDB collectionDB);

    @Update
    void update(CollectionDB... collectionDB);
}
