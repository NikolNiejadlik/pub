package com.example.nicol.pub;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nicol on 2018-01-17.
 */

public class DrinkAdapter  extends RecyclerView.Adapter< DrinkAdapter .ViewHolder>{

    private ArrayList<Drinks> drinks =new ArrayList<>();

    DrinkAdapter(ArrayList<Drinks> drinks) {
        this.drinks = drinks;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        @SuppressLint("InflateParams") View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setDrink(drinks.get(position).getDrink());
        holder.setPrice(drinks.get(position).getPrice() + "");
    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txt_drink)
        TextView txt_drink;
        @BindView(R.id.txt_cena)
        TextView txt_cena;
        @BindView(R.id.obraz)
        ImageView obraz;
        @OnClick(R.id.btn_wybierz)
        void onNameClick(){
            if(obraz.getVisibility()==View.INVISIBLE){
                obraz.setVisibility(View.VISIBLE);
            }
            else{
                obraz.setVisibility(View.INVISIBLE);
            }
        }

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            obraz.setVisibility(View.INVISIBLE);
        }

        void setDrink(String drink) {
            txt_drink.setText(drink);
        }

        void setPrice(String price) {
            txt_cena.setText(price);
        }
    }
}
