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

/**
 * Created by UCA on 10/07/2018.
 */

@Dao
public interface AlbumDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(AlbumDB... albumDB);

    @Query("DELETE FROM albumDB")
    void DeleteAllAlbum();

    @Delete
    void delete(AlbumDB albumDB);

    @Update
    void update(AlbumDB... albumDB);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAlbumList(List<AlbumDB> albumList);

    @Query("SELECT * FROM AlbumDB WHERE game = :gamename")
    List<AlbumDB> getAlbumbyGame(String gamename);

    @Query("SELECT * FROM AlbumDB WHERE albumname = :albumname")
    List<AlbumDB> getAlbumbyName(String albumname);

    @Query("SELECT * FROM AlbumDB WHERE IdAlbum = :idalbum")
    List<AlbumDB> getAlbumbyId (String idalbum);

}
