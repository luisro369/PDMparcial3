package com.luisro00005513.pdmparcial3.Database.Entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by UCA on 10/07/2018.
 */
@Entity
public class UserDB {
    @NonNull
    @PrimaryKey
    @ColumnInfo (name = "_id")
    private String Id;
    @ColumnInfo (name = "username")
    private String Username;
    @ColumnInfo (name = "password")
    private String Password;
    @ColumnInfo(name = "firstName")
    private String FirstName;
    @ColumnInfo (name = "lastName")
    private String LastName;
    @ColumnInfo (name = "phone_number")
    private String PhoneNumber;
    @ColumnInfo (name = "email")
    private String Email;

    @NonNull
    public String getId() {
        return Id;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }


    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(@NonNull String id) {
        Id = id;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
