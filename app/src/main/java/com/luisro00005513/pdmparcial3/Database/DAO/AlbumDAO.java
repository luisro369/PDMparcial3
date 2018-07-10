package com.luisro00005513.pdmparcial3.Database.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;

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
    void insertAlbums(List<AlbumDB> albums);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAlbums(AlbumDB... albums);

    @Query("SELECT * FROM AlbumDB WHERE game = :gamename")
    Flowable<List<AlbumDB>> getAlbumbyGame(String gamename);

    @Query("SELECT * FROM AlbumDB WHERE albumname = :albumname")
    Single<AlbumDB> getAlbumbyName(String albumname);

    @Query("SELECT * FROM AlbumDB WHERE IdAlbum = :idalbum")
    Single<AlbumDB> getAlbumbyId (String idalbum);

}
