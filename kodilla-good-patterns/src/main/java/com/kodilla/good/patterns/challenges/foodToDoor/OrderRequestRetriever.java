package com.kodilla.good.patterns.challenges.foodToDoor;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Apples", 20, 3));
        Producent producent = new Producent("ExtraFoodShop", productsList);
        Customer customer = new Customer("John Smith", "7 Brook Street", 34623);
        Product product = producent.getProductsList().get(0);
        boolean paid = true;
        boolean delivery = false;

        return new OrderRequest(producent, customer, product, paid, delivery);

    }
}