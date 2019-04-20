package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OnlineShop onlineShop;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService is, final OnlineShop os, final OrderRepository or) {
        this.informationService = is;
        this.onlineShop = os;
        this.orderRepository = or;
    }

    public OrderDto proccess(final OrderRequest or) {
        boolean isOrdered = onlineShop.order(or.getUser(), or.getProduct());

        if(isOrdered) {
            informationService.inform(or.getUser());
            orderRepository.createOrder(or.getUser(), or.getProduct());
            return new OrderDto(or.getUser(), true);
        }
        else {
            return new OrderDto(or.getUser(), false);
        }
    }
}
