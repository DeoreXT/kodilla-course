package com.kodilla.good.patterns.challenges.challange0;

public class ProductOnlineShop implements OnlineShop {
    public boolean order(User user, Product product) {
        System.out.println("User " + user.getUser() + " ordered a " + product.getProduct());
        return true;
    }
}
