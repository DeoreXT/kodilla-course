package com.kodilla.good.patterns.challenges;

public class Order {
    private User user;
    private Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
