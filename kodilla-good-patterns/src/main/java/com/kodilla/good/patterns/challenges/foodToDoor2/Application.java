package com.kodilla.good.patterns.challenges.foodToDoor2;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor1 = new OrderProcessor(new GlutenFreeShop());
        orderProcessor1.process(orderRequest);

        OrderProcessor orderProcessor2 = new OrderProcessor(new ExtraFoodShop());
        orderProcessor2.process(orderRequest);

        OrderProcessor orderProcessor3 = new OrderProcessor(new HealthyFoodShop());
        orderProcessor3.process(orderRequest);
    }
}