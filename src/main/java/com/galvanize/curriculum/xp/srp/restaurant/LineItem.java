package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;

/**
 * @author Michael M. Adkins, Sean Franklin, Kayla Jensen
 * @version 2017-04-24
 */
public class LineItem {
    private int quantity;

    private Item item;

    public LineItem(String name, int price, int quantity) {
        this.item = new Item(name, price);
        this.quantity = quantity;
    }

    public LineItem(String name, BigDecimal price, int quantity) {
        this.item = new Item(name, price);
        this.quantity = quantity;
    }

    Item getItem() {
        return item;
    }

    int getQuantity() {
        return quantity;
    }

    private BigDecimal getTotal() {
        return this.item.getPrice().multiply(new BigDecimal(this.getQuantity()));
    }

    @Override
    public String toString() {
        return String.format("%s(%d) $%s%n", this.item.getName(), this.getQuantity(), this.getTotal());
    }
}
