package com.kodilla.good.patterns.challenges.foodToDoor;

public class OrderRequest {
    private Producent producent;
    private Customer customer;
    private Product product;
    private boolean paid;
    private boolean delivery;

    public OrderRequest(Producent producent, Customer customer, Product product, boolean paid, boolean delivery) {
        this.producent = producent;
        this.customer = customer;
        this.product = product;
        this.paid = paid;
        this.delivery = delivery;
    }

    public Producent getProducent() {
        return producent;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isPaid() {
        return paid;
    }

    public boolean isDelivery() {
        return delivery;
    }
}
