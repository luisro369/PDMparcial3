package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.luisro00005513.pdmparcial3.Database.Entities.AuctionDB;


@Dao
public interface AuctionDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AuctionDB... auctionDBS);

    @Query("DELETE FROM AuctionDB")
    void DeleteAllActions();

    @Delete
    void delete(AuctionDB auctionDB);

    @Update
    void update(AuctionDB... auctionDBS);


}
