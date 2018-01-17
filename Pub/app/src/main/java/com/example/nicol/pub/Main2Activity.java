package com.example.nicol.pub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Drinks>drinks=new ArrayList<>();
        drinks.add(new Drinks("Cosmopolitan","15.00 zł"));
        drinks.add(new Drinks("Margarita","16.00 zł"));
        drinks.add(new Drinks("Mohito","12.00 zł"));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recycler.setLayoutManager(layoutManager);

        DrinkAdapter drinkAdapter = new DrinkAdapter (drinks);
        recycler.setAdapter(drinkAdapter);
    }
}
