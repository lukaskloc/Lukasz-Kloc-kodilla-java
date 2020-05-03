package com.kodilla.good.patterns.challenges.foodToDoor;

public class Customer {
    private String name;
    private String address;
    private int customerId;

    public Customer(String name, String address, int customerId) {
        this.name = name;
        this.address = address;
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
