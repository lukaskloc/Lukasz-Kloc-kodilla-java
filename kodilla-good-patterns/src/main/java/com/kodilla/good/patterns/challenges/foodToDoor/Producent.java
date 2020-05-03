package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.ArrayList;
import java.util.List;

public class Producent {
    private String name;
    private List<Product> productsList = new ArrayList<Product>();

    public Producent(String name, List<Product> productsList) {
        this.name = name;
        this.productsList = productsList;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "name='" + name + '\'' +
                '}';
    }
}