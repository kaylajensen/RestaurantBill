package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;
import java.util.List;

class ComputeBill {

    private static BigDecimal computeTotal(List<LineItem> listOfLineItems) {
        BigDecimal total = new BigDecimal(0);
        for (LineItem item : listOfLineItems) {
            total = total.add(item.getItem().getPrice().multiply(new BigDecimal(item.getQuantity())));
        }
        return total;
    }

    static BigDecimal computeTotalWithTax(List<LineItem> listOfLineItems, BigDecimal taxRate) {
        BigDecimal total = computeTotal(listOfLineItems);
        return total.add(computeTax(total, taxRate));
    }

    private static BigDecimal computeTax(BigDecimal total, BigDecimal taxRate) {
        return total.multiply(taxRate);
    }

    static BigDecimal computeTotalWithTip(List<LineItem> listOfLineItems, BigDecimal tipRate) {
        BigDecimal total = computeTotal(listOfLineItems);
        return total.add(computeTip(total, tipRate));
    }

    private static BigDecimal computeTip(BigDecimal total, BigDecimal tipRate) {
        return total.multiply(tipRate);
    }

    static BigDecimal computeTotalWithTaxAndTip(RestaurantBill bill) {
        BigDecimal total = computeTotal(bill.getListOfLineItems());

        return total.add(computeTax(total,bill.getTaxRate()).add(computeTip(total,bill.getTipRate())));
    }
}
