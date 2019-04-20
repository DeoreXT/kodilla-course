package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    public void createOrder(User user, Product product) {
        System.out.println("A " + user.getUser() + " order has been created");
        System.out.println("The ordered product is: " + product.getProduct());
    }
}
