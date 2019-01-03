package com.FlorentL00.Garage;

public class Bike extends Vehicle{
    public Bike(String modelName, String description, String manufacturer, String color, int year, int speed, int weight, int[] dimensions) {
        super(modelName, description, manufacturer, color, year, speed, weight, dimensions);
    }

    @Override
    public void start() {
        System.out.println();
    }

    @Override
    public void stop() {

    }
}
