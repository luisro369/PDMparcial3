package com.luisro00005513.pdmparcial3.ViewModels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.luisro00005513.pdmparcial3.Retrofit.Models.CardApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;

import java.util.List;

import io.reactivex.Single;
import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * {@link AppViewModel}
 * Global App Repository
 */

public class AppViewModel extends AndroidViewModel {
    private AppRepository mRepository;

    public AppViewModel(@NonNull Application application) {
        super(application);
        mRepository = AppRepository.getInstance(application);
    }


    //TODOS LOS METODOS DE API Y BASE DE DATOS
    //------------------getToken-----------------
    public String token(String user, String password){
        return mRepository.getToken(user, password);
    }



    //DATABSE

    //cards
    public Flowable<List<CardDB>> getCardsByUser(long userId) {
        return mRepository.getCardsByUserId(userId)
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<List<UserDB>> getUsersOwnCard(long cardId) {
        return mRepository.getUsersOwnCardDB(cardId)
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<List<CollectionDB>> getUserCollections (long userId) {
        return mRepository.getUserCollectionsDB(userId)
                .observeOn(AndroidSchedulers.mainThread());
    }
    public Flowable<List<CardDB>> getCardsByUserId (long userId) {
        return mRepository.getCardsByUserId(userId)
                .observeOn(AndroidSchedulers.mainThread());
    }
    public Flowable<List<CardDB>> getCardsByUserAlbum (long userId, long albumId) {
        return mRepository.getCardsByUserAlbum(userId, albumId)
                .observeOn(AndroidSchedulers.mainThread());
    }
    public Flowable<List<CardDB>> getCardsByAlbum (long albumId) {
        return mRepository.getCardsByUserId(albumId)
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Completable insertCardsDB(CardDB... cardDBS) {
        return mRepository.insertCardsDB()
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Completable insertCardsDB(List<CardDB> cardDBS) {
        return mRepository.insertCardsDB()
                .observeOn(AndroidSchedulers.mainThread());
    }
    
    public Completable deleteCardsDB(CardDB... cardDBS) {
        return mRepository.deleteCardsDB()
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Completable deleteCardsDB(List<CardDB> cardDBS) {
        return mRepository.deleteCardsDB()
                .observeOn(AndroidSchedulers.mainThread());
    }



    public Flowable<List<AlbumDB>> getAlbumsbyGame(String gameName) {
        return mRepository.getAlbumsByGame(gameName)
                .observeOn(AndroidSchedulers.mainThread());
    }

    public Single<AlbumDB> getAlbumByName(String albumname) {
        return mRepository.getAlbumByName(albumname)
                .observeOn(AndroidSchedulers.mainThread());
    }
    public Single<AlbumDB> getAlbumById(long albumid) {
        return mRepository.getAlbumById(albumid)
                .observeOn(AndroidSchedulers.mainThread());
    }






}
