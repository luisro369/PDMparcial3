package com.luisro00005513.pdmparcial3.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.R;

import java.util.List;

/**
 * Created by UCA on 10/07/2018.
 */

public class CardRecyclerView extends RecyclerView.Adapter<CardRecyclerView.MyViewModel> {
    List<CardDB> listCard;

    public CardRecyclerView(List<CardDB> listCard) {
        this.listCard = listCard;
    }
    @NonNull
    @Override
    public CardRecyclerView.MyViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_cards, null, false);

        return new MyViewModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardRecyclerView.MyViewModel holder, int position) {

        holder.card.setImageResource(R.drawable.ic_account);

    }

    @Override
    public int getItemCount() {
        return listCard.size();
    }

    public class MyViewModel extends RecyclerView.ViewHolder {

        ImageView card;

        public MyViewModel(View itemView) {
            super(itemView);

           card = itemView.findViewById(R.id.card_id);
        }
    }

}
