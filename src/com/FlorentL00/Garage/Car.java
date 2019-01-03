package com.FlorentL00.Garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    private String motor;
    private int literPer100km;
    private int door;
    private List<String> options = new ArrayList<String>();

    public Car(String modelName, String description, String manufacturer, String color, int year, int speed, int weight, int[] dimensions, String motor, int literPer100km, int door, List<String> options) {
        super(modelName, description, manufacturer, color, year, speed, weight, dimensions);
        this.motor = motor;
        this.literPer100km = literPer100km;
        this.door = door;
        this.options = options;
    }

    @Override
    public void start(){
        System.out.println("Je suis " + modelName + " je consomme " + literPer100km + "L au 100km et je démarre!");
    }

    @Override
    public void stop(){
        System.out.println("Je suis " + modelName + " j'arrete mon moteur " + motor);
    }

    public void startHeadLight(){
        System.out.println("J'allume mes phares");
    }

    public void openTrunk(){
        System.out.println("J'ouvre mon coffre");
    }

    public String getMotor() {
        return motor;
    }

    public int getLiterPer100km() {
        return literPer100km;
    }

    public int getDoor() {
        return door;
    }

    public List<String> getOptions() {
        return options;
    }
}
