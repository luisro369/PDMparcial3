package com.luisro00005513.pdmparcial3.Fragments;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.luisro00005513.pdmparcial3.MainActivity;
import com.luisro00005513.pdmparcial3.R;

/**
 * Created by UCA on 10/07/2018.
 */

public class FragmentLogin extends android.support.v4.app.Fragment {
    Context context;
    public static String user;
    public static String password;

    public FragmentLogin(){
        //required
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.layout_login, container, false);

        return view;
    }
}
