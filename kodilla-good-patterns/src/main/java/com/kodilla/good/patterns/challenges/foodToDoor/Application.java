package com.kodilla.good.patterns.challenges.foodToDoor;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor processor = new OrderProcessor(new ProductOrderService());

        processor.process(orderRequest);
    }
}