package com.FlorentL00.Miam;

public class Aliment {

    String nom;
    Boolean estCuit;

    public void manger() {
        if (estCuit) {
            System.out.println("com.FlorentL00.Miam miam! cet aliment : " + nom + " est bien cuit");
        } else {
            System.out.println("Beeerk! cet aliment : " + nom + " est cru !");
        }
    }
}