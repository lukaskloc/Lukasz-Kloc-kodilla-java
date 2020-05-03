package com.kodilla.good.patterns.challenges.foodToDoor2;

public class OrderProcessor {

    private Producer orderService;

    public OrderProcessor(final Producer orderService) {
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.process(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderDate(), orderRequest.getDeliveryDate());

        if (isOrdered) {
            return new OrderDto(orderRequest.getUser(), true);
        }
        return new OrderDto(orderRequest.getUser(), false);
    }
}
