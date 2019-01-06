package com.FlorentL00.Miam;

public class Main {

    public static void main(String[] args) {

        Aliment Cake = new Aliment();
        Cake.nom = "cake aux fruits";
        Cake.estCuit = false;

        Aliment Gateau = new Aliment();
        Gateau.nom = "Gateau aux choccolat";
        Gateau.estCuit = false;

        Four monPetitFour = new Four();
        // monPetitFour.capacite = 30;
        // monPetitFour.puissance = 180;

        Four monGrandFour = new Four();
        // monGrandFour.getCapacite = 60;
        // monGrandFour.puissance = 250;

        Cake.manger();
        System.out.println("");
        monPetitFour.cuire(Cake);
        System.out.println("");
        Cake.manger();

        Gateau.manger();
        System.out.println("");
        monPetitFour.cuire(Gateau);
        System.out.println("");
        Gateau.manger();

        Four four = new Four();
        four.cuir(30, 15);

        }
    }
