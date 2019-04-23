package com.kodilla.good.patterns.challenges.challange0;

import com.kodilla.good.patterns.challenges.challange0.Product;
import com.kodilla.good.patterns.challenges.challange0.User;

public class Order {
    private User user;
    private Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
