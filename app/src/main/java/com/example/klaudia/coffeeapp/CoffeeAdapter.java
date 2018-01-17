package com.example.klaudia.coffeeapp;

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
 * Created by Klaudia on 17.01.2018.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    ArrayList<Coffee> coffees = new ArrayList<>();

    CoffeeAdapter(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public CoffeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(coffees.get(position).getName());
        holder.setPrice(coffees.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.Check)
        ImageView Wybrane;
        @BindView(R.id.Name)
        TextView Name;
        @BindView(R.id.Price)
        TextView Price;

        @OnClick(R.id.SelectBtn)
        void onNameClick(){
            if(Wybrane.getVisibility()==View.INVISIBLE){
                Wybrane.setVisibility(View.VISIBLE);
            }
            else{
                Wybrane.setVisibility(View.INVISIBLE);
            }
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            Wybrane.setVisibility(View.INVISIBLE);
        }

        public void setName(String name) {
            Name.setText(name);
        }

        public void setPrice(String price) {
            Price.setText(price);
        }
    }
}
