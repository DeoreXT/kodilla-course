package com.kodilla.good.patterns.challenges.challange1;

public interface OrderExecution {
    boolean process (Producer producer, ProductType productType, Quantity quantity);
}
