package com.kodilla.good.patterns.challenges;

public interface OrderExecution {
    boolean process (Producer producer, ProductType productType, Quantity quantity);
}
