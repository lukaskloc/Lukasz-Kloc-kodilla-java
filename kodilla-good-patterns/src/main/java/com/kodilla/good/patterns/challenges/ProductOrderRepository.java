package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProductOrderRepository {
    private Map<User, LocalDate> orders = new HashMap<>();

    public void createOrder(User user, LocalDate shippedOn) {
        orders.put(user, shippedOn);
        System.out.println("Order added to the database");
    }
}
