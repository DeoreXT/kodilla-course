package com.kodilla.good.patterns.challenges;

public class ExtraFoodShopService implements OrderExecution {
    @Override
    public boolean process(Producer producer, ProductType productType, Quantity quantity) {
        System.out.println("Order information");
        System.out.println("Supplier: " + producer.getProducer());
        System.out.println("Product type: " + productType.getProductType());
        System.out.println("Quantity: " + quantity.getQuantity());
        return true;
    }
}
