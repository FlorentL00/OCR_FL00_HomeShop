package com.FlorentL00.Miam;

public class Four {

    int puissance;
    int capacite;

    public void cuire(Aliment aliment){
        System.out.println("Je cuit un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("avec une puissance de " + puissance + " degrés");
        aliment.estCuit = true;
    }
}
