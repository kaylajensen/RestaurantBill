package com.galvanize.curriculum.xp.srp.restaurant;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ComputeBillTest {

    @Test
    public void testComputeTaxEmptyListOfLineItems(){
        List< LineItem > listOfLineItems = new ArrayList<>();

        BigDecimal taxRate = new BigDecimal("0.20");

        BigDecimal actualTotalWithTax = ComputeBill.computeTotalWithTax(listOfLineItems, taxRate);

        assertEquals(new BigDecimal("0.00"), actualTotalWithTax);
    }

    @Test
    public void testComputeTaxWithListOfLineItems(){
        List< LineItem > listOfLineItems = new ArrayList<>();

        listOfLineItems.add((new LineItem("Sprite", 10, 4)));

        BigDecimal taxRate = new BigDecimal("0.20");

        BigDecimal actualTotalWithTax = ComputeBill.computeTotalWithTax(listOfLineItems, taxRate);

        assertEquals(new BigDecimal("48.00"), actualTotalWithTax);
    }

    @Test
    public void testComputeTipEmptyListOfLineItems(){
        List< LineItem > listOfLineItems = new ArrayList<>();

        BigDecimal tipRate = new BigDecimal("0.20");

        BigDecimal actualTotalWithTip = ComputeBill.computeTotalWithTip(listOfLineItems, tipRate);

        assertEquals(new BigDecimal("0.00"), actualTotalWithTip);
    }

    @Test
    public void testComputeTipWithListOfLineItems(){
        List< LineItem > listOfLineItems = new ArrayList<>();

        listOfLineItems.add((new LineItem("Sprite", 10, 4)));

        BigDecimal tipRate = new BigDecimal("0.20");

        BigDecimal actualTotalWithTip = ComputeBill.computeTotalWithTip(listOfLineItems, tipRate);

        assertEquals(new BigDecimal("48.00"), actualTotalWithTip);
    }

    @Test
    public void testComputeTaxTipEmptyListOfLineItems(){
        BigDecimal tipRate = new BigDecimal("0.20");
        BigDecimal taxRate = new BigDecimal("0.5");

        RestaurantBill restaurantBill = new RestaurantBill();
        restaurantBill.setTaxRate(taxRate);
        restaurantBill.setTipRate(tipRate);

        BigDecimal actualTotalWithTip = ComputeBill.computeTotalWithTaxAndTip(restaurantBill);

        assertEquals(new BigDecimal("0.00"), actualTotalWithTip);
    }

    @Test
    public void testComputeTaxTipWithListOfLineItems(){
        List< LineItem > listOfLineItems = new ArrayList<>();
        listOfLineItems.add((new LineItem("Sprite", 10, 4)));

        RestaurantBill restaurantBill = new RestaurantBill(listOfLineItems);

        BigDecimal tipRate = new BigDecimal("0.20");
        BigDecimal taxRate = new BigDecimal("0.5");

        restaurantBill.setTipRate(tipRate);
        restaurantBill.setTaxRate(taxRate);

        BigDecimal actualTotalWithTip = ComputeBill.computeTotalWithTaxAndTip(restaurantBill);

        assertEquals(new BigDecimal("68.00"), actualTotalWithTip);
    }
}
