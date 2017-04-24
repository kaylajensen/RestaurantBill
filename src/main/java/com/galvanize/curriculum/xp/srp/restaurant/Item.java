package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;

import static java.lang.String.format;

public class Item {
    private String name;
    private BigDecimal price;

    Item(String name, int price) {
        this(name, new BigDecimal(price));
    }

    Item(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    BigDecimal getPrice() {
        return price;
    }

//    @Override
//    public int hashcode(){
//        return this.name.hashCode();
//    }

    @Override
    public String toString() {
        return format("%s(%d)%n", this.getName());
    }
}
