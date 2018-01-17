package com.example.nicol.pub;

/**
 * Created by Nicol on 2018-01-17.
 */

public class Drinks {
    private String drink;
    private String price;

    Drinks(String drink, String price) {
        this.drink = drink;
        this.price = price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
