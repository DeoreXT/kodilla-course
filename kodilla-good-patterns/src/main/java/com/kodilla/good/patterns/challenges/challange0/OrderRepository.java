package com.kodilla.good.patterns.challenges.challange0;

import com.kodilla.good.patterns.challenges.challange0.Product;
import com.kodilla.good.patterns.challenges.challange0.User;

public interface OrderRepository {

    void createOrder(User user, Product product);
}
