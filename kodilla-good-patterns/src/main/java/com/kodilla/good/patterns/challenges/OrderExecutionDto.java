package com.kodilla.good.patterns.challenges;

public class OrderExecutionDto {
    public Producer producer;
    public boolean isOrdered;

    public OrderExecutionDto(final Producer producer, final boolean isOrdered) {
        this.producer = producer;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
