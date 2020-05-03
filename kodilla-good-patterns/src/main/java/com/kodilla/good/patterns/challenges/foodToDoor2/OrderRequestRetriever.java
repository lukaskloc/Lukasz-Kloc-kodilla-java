package com.kodilla.good.patterns.challenges.foodToDoor2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Wick");
        Product product = new Product("BulletProofCoffee", 10);

        LocalDateTime orderDate = LocalDateTime.of(2020, 5, 1, 10, 10);
        LocalDate deliveryDate = LocalDate.of(2020, 5, 14);

        return new OrderRequest(user, product, orderDate, deliveryDate);
    }
}
