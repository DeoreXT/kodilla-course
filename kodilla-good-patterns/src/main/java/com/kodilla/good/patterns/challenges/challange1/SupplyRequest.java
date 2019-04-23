package com.kodilla.good.patterns.challenges.challange1;

public class SupplyRequest {
    private Producer producer;
    private ProductType productType;
    private Quantity quantity;

    public SupplyRequest(Producer producer, ProductType productType, Quantity quantity) {
        this.producer = producer;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Producer getProducer() {
        return producer;
    }

    public ProductType getProductType() {
        return productType;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
