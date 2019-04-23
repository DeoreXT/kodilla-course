package com.kodilla.good.patterns.challenges;

public class Food2DoorService {
    private OrderExecution orderExecution;

    public Food2DoorService(final OrderExecution oe) {
        this.orderExecution = oe;
    }

    public OrderExecutionDto process(final SupplyRequest sr) {
        boolean isOrdered = orderExecution.order(sr.getProducer(), sr.getProductType(), sr.getQuantity());

        if (isOrdered) {

            return new OrderExecutionDto(sr.getProducer(), true);
        } else {
            return new OrderExecutionDto(sr.getProducer(), false);
        }
    }
}
