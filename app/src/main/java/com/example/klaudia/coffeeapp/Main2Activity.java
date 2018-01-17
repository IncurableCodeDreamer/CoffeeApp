package com.example.klaudia.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.Recycler)
    RecyclerView Recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        Recycler.setLayoutManager(layoutManager);

        ArrayList<Coffee>coffees = new ArrayList<>();
        coffees.add(new Coffee ("Latte","13.50 zł"));
        coffees.add(new Coffee("Espresso","8.00 zł"));
        coffees.add(new Coffee("Cappucino", "10.00 zł"));
        coffees.add(new Coffee("Americano", "12.00 zł"));

        CoffeeAdapter coffeeAdapter = new CoffeeAdapter(coffees);
        Recycler.setAdapter(coffeeAdapter);
    }
}
