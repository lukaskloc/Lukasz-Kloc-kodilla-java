package com.kodilla.good.patterns.challenges.foodToDoor;

public class ProductOrderService {
    private ProductOrderService productOrderService;

    public boolean order(final Producent producent, final Customer customer, final Product product,
                         final boolean paid, final boolean delivery) {
        System.out.println("New order for: " + producent + "Ordered by: " + customer + ". Ordered: " + " pcs of: "
        + product.getName() + " for " + product.getPrice() + " each. " + (paid ? "Order paid for" : "Order not paid for") +
                (delivery ? "Order to be delivered." : "Order to be picked up"));
        return true;
    }
}
