package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderProcessor {
    private ProductMailService productMailService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(final ProductMailService productMailService,
                          final ProductOrderService productOrderService,
                          final ProductOrderRepository productOrderRepository) {
        this.productMailService = productMailService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getOrderedOn(),
                orderRequest.isPaid(), orderRequest.getShippedOn());
        if (isOrdered) {
            productMailService.sendEmail();
            productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getShippedOn());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
