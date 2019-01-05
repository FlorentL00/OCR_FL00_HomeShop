package com.FlorentL00.Paris;

public class Taxi implements MoyenDeLocomotion{
    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un taxi est je vais à l'adresse : " + adresse);
    }
}

