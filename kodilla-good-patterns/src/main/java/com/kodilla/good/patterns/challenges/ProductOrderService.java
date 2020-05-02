package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {

    public boolean order(final User user, final LocalDate orderedOn, boolean paid, final LocalDate shippedOn) {
        System.out.println("Odered by: " + user + ", on: " + orderedOn + "."
                + (paid ? " Order paid" : " Order not paid") + ". Shipped on : " + shippedOn);
        return true;
    }
}
