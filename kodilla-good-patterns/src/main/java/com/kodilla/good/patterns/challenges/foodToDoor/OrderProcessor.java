package com.kodilla.good.patterns.challenges.foodToDoor;

public class OrderProcessor {
    private ProductOrderService productOrderService;

    public OrderProcessor(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getProducent(),  orderRequest.getCustomer(),
                orderRequest.getProduct(), orderRequest.isPaid(), orderRequest.isDelivery());
        if (isOrdered) {
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
