package com.kodilla.good.patterns.challenges;

public class RunnerProductOrderService {
    public static void main(String [] Args) {
        OrderRequest orderRequest = new OrderRequest(new User("Thomas"), new Product("Book"));
        ProductOrderService productOrderService = new ProductOrderService(new MailServices(), new ProductOnlineShop(), new ProductOrderRepository());
        productOrderService.proccess(orderRequest);
    }

}
