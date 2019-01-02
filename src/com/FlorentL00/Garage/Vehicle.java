package com.FlorentL00.Garage;

public class Vehicle {
    private String modelName;
    private String description;
    private String manufacturer;
    private String color;
    private int year;
    private int speed;
    private int weight;
    private int[] dimensions = new int[3];

    public Vehicle(String modelName, String description, String manufacturer, String color, int year, int speed, int weight, int[] dimensions) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public void start(){
        System.out.println("Ma voiture, " + modelName + " démarre!");
    }

    public void stop(){
        System.out.println("Ma voiture, " + modelName + " s'arrête!");
    }

    public String getModelName() {
        return modelName;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getDimensions() {
        return dimensions;
    }
}
