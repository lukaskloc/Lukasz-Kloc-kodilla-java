package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductMailService(),
                new ProductOrderService(), new ProductOrderRepository());

        orderProcessor.process(orderRequest);
    }
}
