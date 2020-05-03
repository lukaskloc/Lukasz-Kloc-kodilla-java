package com.kodilla.good.patterns.challenges.foodToDoor2;

import com.kodilla.good.patterns.challenges.foodToDoor2.Producer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HealthyFoodShop implements Producer {

    @Override
    public boolean process(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Healthy Shop welcomes: " + user.getName() + " " + user.getSurname());
        System.out.println("Your order is: " + product.getQuantity() + " " + product.getProductType());
        System.out.println("Order was placed on: " + orderDate.toString());
        System.out.println("Estimated delivery date: " + deliveryDate.toString());
        return true;
    }
}
