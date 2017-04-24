package com.galvanize.curriculum.xp.srp.restaurant.acceptance;

import com.galvanize.curriculum.xp.srp.restaurant.LineItem;
import com.galvanize.curriculum.xp.srp.restaurant.RestaurantBill;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AppAcceptanceTest {

//    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

//    @Before
//    public void setUpStreams() {
//        System.setOut(new PrintStream(outContent));
//        System.setErr(new PrintStream(errContent));
//    }
//
//    @After
//    public void cleanUpStreams() {
//        System.setOut(null);
//        System.setErr(null);
//    }

    @Test
    public void testBillAT() {
        LineItem burger = new LineItem("Burger", 4, 2);
        LineItem macAndCheese = new LineItem("Mac and Cheese", 6, 1);
        LineItem sprite = new LineItem("Sprite", 1, 3);

        List<LineItem> foodItems = Arrays.asList(burger, macAndCheese, sprite);
        RestaurantBill bill = new RestaurantBill(foodItems);
        String actualReceipt = bill.printItemizedReceipt();

        String receipt = "Burger(2) $8" + "\n" +
        "Mac and Cheese(1) $6" + "\n" +
        "Sprite(3) $3" + "\n" +
        "--------------------" + "\n" +
        "tax:          $18.70" + "\n" +
        "--------------------" + "\n" +
        "tip:          $20.06" + "\n" +
        "--------------------" + "\n" +
        "total:        $21.76" + "\n" ;

        assertEquals(receipt, actualReceipt);
    }
}
