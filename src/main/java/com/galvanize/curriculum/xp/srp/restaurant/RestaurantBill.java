package com.galvanize.curriculum.xp.srp.restaurant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RestaurantBill {
    private List<LineItem> listOfLineItems = new ArrayList<>();

    private BigDecimal taxRate = new BigDecimal(".10");
    private BigDecimal tipRate = new BigDecimal(".18");

    public RestaurantBill() {

    }

    public RestaurantBill(List<LineItem> listOfLineItems) {
        this.listOfLineItems = listOfLineItems;
    }

    public List<LineItem> getListOfLineItems() {
        return listOfLineItems;
    }

    public void setListOfLineItems(List<LineItem> listOfLineItems) {
        this.listOfLineItems = listOfLineItems;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTipRate() {
        return tipRate;
    }

    public void setTipRate(BigDecimal tipRate) {
        this.tipRate = tipRate;
    }

    public String printItemizedReceipt() {
        StringBuffer output = new StringBuffer();
        String separater = "--------------------\n";

        for (LineItem item : listOfLineItems) {
            output.append(item);
        }

        output.append(separater)
                .append("tax:          ")
                .append("$")
                .append(ComputeBill.computeTotalWithTax(listOfLineItems, this.getTaxRate()))
                .append("\n")
                .append(separater)
                .append("tip:          ")
                .append("$")
                .append(ComputeBill.computeTotalWithTip(listOfLineItems, this.getTipRate()))
                .append("\n")
                .append(separater)
                .append("total:        ")
                .append("$")
                .append(ComputeBill.computeTotalWithTaxAndTip(this))
                .append("\n");

        return output.toString();
    }

}
