package com.galvanize.curriculum.xp.srp.restaurant;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RestaurantBillTest {
    @Test
    public void testSetAndGetTaxRate() {
        BigDecimal expectedTaxRate = new BigDecimal("0.7");

        RestaurantBill restaurantBill = new RestaurantBill();
        restaurantBill.setTaxRate(expectedTaxRate);

        assertEquals(restaurantBill.getTaxRate(), expectedTaxRate);
    }

    @Test
    public void testSetAndGetTipRate() {
        BigDecimal expectedTipRate = new BigDecimal("0.8");

        RestaurantBill restaurantBill = new RestaurantBill();
        restaurantBill.setTipRate(expectedTipRate);

        assertEquals(restaurantBill.getTipRate(), expectedTipRate);
    }

}
