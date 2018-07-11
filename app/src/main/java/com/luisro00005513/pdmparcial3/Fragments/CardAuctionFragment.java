package com.luisro00005513.pdmparcial3.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luisro00005513.pdmparcial3.Adapter.CardRecyclerView;
import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UCA on 10/07/2018.
 */

public class CardAuctionFragment  extends Fragment {

        private View view;
        List<CardDB> listCard;
        RecyclerView recyclerViewCard;

        public CardAuctionFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            view = inflater.inflate(R.layout.card_recycler, container, false);
            listCard = new ArrayList<>();
            recyclerViewCard = view.findViewById(R.id.recycler);
            recyclerViewCard.setLayoutManager(new GridLayoutManager(getContext(),3));

            llenado();

            CardRecyclerView adapter = new CardRecyclerView(listCard);
            recyclerViewCard.setAdapter(adapter);

            return view;
        }

        private void llenado() {

            listCard.add(new CardDB("Carta 1", "Raro", "Descripcion", "urlImagen"));
            listCard.add(new CardDB("Carta 2", "Extraña", "Descripcion", "urlImagen"));
            listCard.add(new CardDB("Carta 3", "Epic", "Descripcion", "fornite"));
        }

}
