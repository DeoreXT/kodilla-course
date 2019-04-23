package com.kodilla.good.patterns.challenges;

public class RunnerFood2Door {
    public static void main(String [] Args) {
        SupplyRequest supplyRequest = new SupplyRequest(new Producer("ExtraFoodShop"), new ProductType("Milk"), new Quantity(100));
        Food2DoorService food2DoorService = new Food2DoorService(new ExtraFoodShopService());
        food2DoorService.process(supplyRequest);
    }
}
