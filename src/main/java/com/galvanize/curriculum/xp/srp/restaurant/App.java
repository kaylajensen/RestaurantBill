package com.galvanize.curriculum.xp.srp.restaurant;

import java.util.Arrays;
import java.util.List;

class App {

    public static void main(String[] args) {
        // example of usage:
        LineItem burger = new LineItem("Burger", 4, 2);
        LineItem macAndCheese = new LineItem("Mac and Cheese", 6, 1);
        LineItem sprite = new LineItem("Sprite", 1, 3);

        List<LineItem> foodLineItems = Arrays.asList(burger, macAndCheese, sprite);
        RestaurantBill bill = new RestaurantBill(foodLineItems);
        bill.printItemizedReceipt();
    }
}
