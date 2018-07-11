package com.luisro00005513.pdmparcial3.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.luisro00005513.pdmparcial3.Database.Entities.CardDB;
import com.luisro00005513.pdmparcial3.Fragments.Store_auction;
import com.luisro00005513.pdmparcial3.MainActivity;
import com.luisro00005513.pdmparcial3.R;

import java.util.List;

/**
 * Created by UCA on 10/07/2018.
 */

public class CardRecyclerView extends RecyclerView.Adapter<CardRecyclerView.MyViewModel> {
    List<CardDB> listCard;
    Dialog myDialog;
    public CardRecyclerView(List<CardDB> listCard) {
        this.listCard = listCard;
    }


    @NonNull
    @Override
    public CardRecyclerView.MyViewModel onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {

        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_cards, null, false);
        final MyViewModel myViewModel = new MyViewModel(view);



        myViewModel.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog = new Dialog(v.getContext());
                myDialog.setContentView(R.layout.layout_fragment_auction);

                TextView txtName = (TextView) v.findViewById(R.id.nombreCartaS);

               // txtName.setText(listCard.get(myViewModel.getAdapterPosition()).getCardTitle());
                Toast.makeText(v.getContext(), "hola", Toast.LENGTH_SHORT).show();

                myDialog.show();
            }
        });



        return myViewModel;
    }

    @Override
    public void onBindViewHolder(@NonNull CardRecyclerView.MyViewModel holder, int position) {

        holder.card.setImageResource(R.drawable.ic_account);



        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return listCard.size();
    }

    public class MyViewModel extends RecyclerView.ViewHolder {

        ImageView card;
        CardView item;

        public MyViewModel(View itemView) {
            super(itemView);

           card = itemView.findViewById(R.id.card_id);
           item = itemView.findViewById(R.id.item_list_cards);
        }
    }

}
