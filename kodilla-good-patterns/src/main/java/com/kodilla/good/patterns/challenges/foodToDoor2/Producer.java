package com.kodilla.good.patterns.challenges.foodToDoor2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Producer {

        boolean process(User user, Product product, LocalDateTime orderDate, LocalDate deliveryDate);

}
