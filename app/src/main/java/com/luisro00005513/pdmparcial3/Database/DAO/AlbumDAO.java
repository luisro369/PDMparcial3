package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;

/**
 * Created by UCA on 10/07/2018.
 */

@Dao
public interface AlbumDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AlbumDB... albumDBs);

    @Query("DELETE FROM AlbumDB")
    void DeleteAllAlbums();

    @Delete
    void delete(AlbumDB... albumDB);

    @Update
    void update(AlbumDB... albumDB);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAlbums(List<AlbumDB> albums);


    @Query("SELECT * FROM AlbumDB WHERE game = :gamename")
    Flowable<List<AlbumDB>> getAlbumbyGame(String gamename);

    @Query("SELECT * FROM AlbumDB WHERE game = :albumname")
    Single<AlbumDB> getAlbumbyName(String albumname);

    @Query("SELECT * FROM AlbumDB WHERE _id = :idalbum")
    Single<AlbumDB> getAlbumbyId (long idalbum);

}
