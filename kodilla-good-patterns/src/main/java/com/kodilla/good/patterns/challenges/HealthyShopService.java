package com.kodilla.good.patterns.challenges;

public class HealthyShopService implements OrderExecution {
    public boolean process(Producer producer, ProductType productType, Quantity quantity) {
        System.out.println("Order information\nSupplier: " + producer.getProducer());
        System.out.println("Product type: " + productType.getProductType());
        System.out.println("Quantity: " + quantity.getQuantity());
        return true;
    }
}
