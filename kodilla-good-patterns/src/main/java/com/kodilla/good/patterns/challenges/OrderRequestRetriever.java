package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John Smith", 234664);
        LocalDate orderedOn = LocalDate.of(2020, 05, 16);
        boolean paid = true;
        LocalDate shippedOn = LocalDate.of(2020, 05, 02);

        return new OrderRequest(user, orderedOn, paid, shippedOn);
    }
}
