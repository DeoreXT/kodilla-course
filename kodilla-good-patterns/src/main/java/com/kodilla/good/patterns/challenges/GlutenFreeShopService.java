package com.kodilla.good.patterns.challenges;

public class GlutenFreeShopService implements OrderExecution {
    @Override
    public boolean process(Producer producer, ProductType productType, Quantity quantity) {
        System.out.println("Order information\nSupplier: " + producer.getProducer());
        System.out.println("Product type: " + productType.getProductType() + "\nQuantity: " + quantity.getQuantity());
        return true;
    }
}
