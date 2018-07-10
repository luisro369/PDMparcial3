package com.luisro00005513.pdmparcial3.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.pdmparcial3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Store_auction extends Fragment {


    public Store_auction() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_auction, container, false);
    }

}
