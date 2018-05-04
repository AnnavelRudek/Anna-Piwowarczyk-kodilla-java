package com.kodilla.good.patterns.challenges.service;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository){
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if (isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }
}
