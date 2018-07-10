package com.luisro00005513.pdmparcial3.ViewModels;


import android.app.Application;
import android.util.Log;
import android.widget.Toast;


import com.luisro00005513.pdmparcial3.Retrofit.Models.CardApi;
import com.luisro00005513.pdmparcial3.Database.AppRoomDatabase;
import com.luisro00005513.pdmparcial3.Database.Entities.AlbumDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Database.Entities.CollectionDB;
import com.luisro00005513.pdmparcial3.Database.Entities.UserDB;
import com.luisro00005513.pdmparcial3.Retrofit.Models.LoginApi;
import com.luisro00005513.pdmparcial3.Retrofit.Models.UserApi;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitService;
import com.luisro00005513.pdmparcial3.Retrofit.RetrofitServices;

import java.io.IOException;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * {@link AppRepository}
 * Global App Repository
 */


public class AppRepository {
    private static AppRepository INSTANCE;
    private RetrofitServices retrofitServices;
    public static String token;
    private AppRoomDatabase db;

    public static AppRepository getInstance(Application application) {
        if (INSTANCE == null) {
            INSTANCE = new AppRepository(application);
        }
        return INSTANCE;
    }


    //Instanciar database e instanciar retrofit
    private AppRepository(Application application) {
        db = AppRoomDatabase.getInstance(application);
        retrofitServices = new RetrofitServices();
        retrofitServices.conectar();
    }

    //-------------------------GetToken---------------------
    public String getToken(String user, String pass){
        Single<LoginApi> login = retrofitServices.getRetrofitService().getToken(new LoginApi(user,pass))
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

        login.subscribe((loginapi, throwable)-> {
            token = loginapi.getToken();
            Log.d("entro", token+"");
        });

        return token;
    }//getToken



    //DATABASE METHODS

    //Users
    public Completable insertUserDB(final UserDB... users) {
        return Completable.fromCallable(()->{
           db.userDAO().insert(users);
           return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable insertAllUserDB(List<UserDB> users) {
        return Completable.fromCallable(()->{
            db.userDAO().insert(users);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }


    public Completable deleteAllUsersDB() {
        return Completable.fromCallable(() -> {
            db.userDAO().DeleteAllUsers();
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable deleteUsersDB(UserDB... userDBS) {
        return  Completable.fromCallable(() -> {
            db.userDAO().delete(userDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable updateUsersDB(UserDB... userDBS) {
        return  Completable.fromCallable(() -> {
            db.userDAO().update(userDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Flowable<List<UserDB>> getUsersOwnCardDB(long cardId) {
        return db.userDAO().getUsersByCardRepository(cardId);
    }

    public Completable insertCardsToUserDB(long userID, String state, CardDB... cardDBS) {
        ArrayList<CollectionDB> collectionDBS = new ArrayList<>();
        for (CardDB cardDB : cardDBS) {
            CollectionDB coll = new CollectionDB();
            coll.setId(0);
            coll.setUserId(userID);
            coll.setCardId(cardDB.getCardId());
            coll.setState(state);
            collectionDBS.add(coll);
        }
        return Completable.fromCallable(() -> {
            db.collectionDAO().insert(collectionDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }

    public Flowable<List<CollectionDB>> getUserCollectionsDB (long userId) {
        return db.collectionDAO().getUserCollections(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable updateCollectionsDB(CollectionDB... collectionDBS) {
        return Completable.fromCallable(() -> {
            db.collectionDAO().insert(collectionDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable deleteAllCollectionsDB() {
        return Completable.fromCallable(() -> {
            db.collectionDAO().DeleteAllCollection();
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable deleteCollectionsDB(CollectionDB... collectionDBS) {
        return Completable.fromCallable(() -> {
            db.collectionDAO().delete(collectionDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable deleteCollectionsDB(List<CollectionDB> collectionDBS) {
        return Completable.fromCallable(() -> {
            db.collectionDAO().delete(collectionDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }



    //Cards

    public Completable insertCardsDB(CardDB... cardDBS) {
        return  Completable.fromCallable(() -> {
            db.cardDAO().insert(cardDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable insertCardsDB(List<CardDB> cardDBS) {
        return  Completable.fromCallable(() -> {
            db.cardDAO().insert(cardDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable deleteCardsDB(CardDB... cardDBS) {
        return  Completable.fromCallable(() -> {
            db.cardDAO().delete(cardDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }
    public Completable deleteCardsDB(List<CardDB> cardDBS) {
        return  Completable.fromCallable(() -> {
            db.cardDAO().delete(cardDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable deleteAllCards() {
        return  Completable.fromCallable(() -> {
            db.cardDAO().DeleteAllCards();
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable updateAllCards(CardDB... cardDBS) {
        return  Completable.fromCallable(() -> {
            db.cardDAO().update(cardDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Flowable<List<CardDB>> getCardsByUserId(long userId) {
        return db.cardDAO().getCardsByUser(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }
    public Flowable<List<CardDB>> getCardsByUserAlbum(long userId, long albumid) {
        return db.cardDAO().getCardsByUserAlbum(userId,albumid)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }
    public Flowable<List<CardDB>> getCardsByAlbum(long albumId) {
        return db.cardDAO().getCardsByAlbum(albumId)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }

    // Album

    public Completable insertAlbumDB(final AlbumDB... albumDBS) {
        return Completable.fromCallable(()->{
            db.albumDAO().insert(albumDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }



    public Completable insertAlbumsDB(List<AlbumDB> albumDBSlist) {
        return Completable.fromCallable(()->{
            db.albumDAO().insertAlbums(albumDBSlist);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }


    public Completable deleteALLAlbumDB() {
        return  Completable.fromCallable(() -> {
            db.albumDAO().DeleteAllAlbums();
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable deleteAlbumsDB(AlbumDB... albumDBS) {
        return  Completable.fromCallable(() -> {
            db.albumDAO().delete(albumDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Completable updateAlbumsDB(AlbumDB... albumDBS) {
        return  Completable.fromCallable(() -> {
            db.albumDAO().update(albumDBS);
            return null;
        })
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());
    }

    public Flowable<List<AlbumDB>> getAlbumsByGame(String gamename) {
        return db.albumDAO().getAlbumbyGame(gamename)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }
    public Single<AlbumDB> getAlbumByName(String albumname) {
        return db.albumDAO().getAlbumbyName(albumname)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }
    public Single<AlbumDB> getAlbumById(long albumid) {
        return db.albumDAO().getAlbumbyId(albumid)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io());

    }
}
