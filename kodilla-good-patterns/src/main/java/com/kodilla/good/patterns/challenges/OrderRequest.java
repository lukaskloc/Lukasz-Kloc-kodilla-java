package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private LocalDate orderedOn;
    private boolean paid;
    private LocalDate shippedOn;

    public OrderRequest(final User user, final LocalDate orderedOn, final boolean paid, final LocalDate shippedOn) {
        this.user = user;
        this.orderedOn = orderedOn;
        this.paid = paid;
        this.shippedOn = shippedOn;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderedOn() {
        return orderedOn;
    }

    public boolean isPaid() {
        return paid;
    }

    public LocalDate getShippedOn() {
        return shippedOn;
    }
}
