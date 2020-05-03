package com.kodilla.good.patterns.challenges.foodToDoor2;

import com.kodilla.good.patterns.challenges.foodToDoor2.Producer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExtraFoodShop implements Producer {

    @Override
    public boolean process(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate) {
        System.out.println("Welcome " + user.getName() + " " + user.getSurname() + " to the EXTRA FOOD SHOP!\n"
                + "Your order is " + product.getQuantity() +
                " " + product.getProductType() + "\nOrder date is: " + orderDate.toString() + " --- estimated delivery date: "
                + deliveryDate.toString());
        return true;
    }
}
