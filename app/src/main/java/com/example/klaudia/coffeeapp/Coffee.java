package com.example.klaudia.coffeeapp;

/**
 * Created by Klaudia on 17.01.2018.
 */

public class Coffee {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    private String Name;
    private String Price;

    public Coffee(String Name, String Price) {
        this.Name=Name;
        this.Price=Price;
    }
}
