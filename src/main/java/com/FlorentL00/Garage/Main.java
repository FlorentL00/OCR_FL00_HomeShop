package com.FlorentL00.Garage;

import com.sun.tools.javac.util.List;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Car("RS6", "Audi RS", "Audi", "Black", 2018, 245, 2000, new int[]{5000, 3000, 1500}, "Motor Name", 10, 5, List.from(new String[]{"Vitres Electriques", "GPS", "Climatisation"}));

    }
}
