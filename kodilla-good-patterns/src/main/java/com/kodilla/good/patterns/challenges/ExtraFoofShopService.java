package com.kodilla.good.patterns.challenges;

public class ExtraFoofShopService implements OrderExecution {
    @Override
    public boolean order(Producer producer, ProductType productType, Quantity quantity) {
        System.out.println("Order information");
        System.out.println("Supplier: " + producer.getProducer());
        System.out.println("Product type: " + productType.getProductType());
        System.out.println("Quantity: " + quantity.getQuantity());
        return true;
    }
}
