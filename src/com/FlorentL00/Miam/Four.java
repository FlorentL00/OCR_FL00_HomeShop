package com.FlorentL00.Miam;

public class Four {
    private int puissance;
    private int capacite;

    /**
     * 4 types de visibilités:
     * Private = empeche d'acceder depuis l'exterieur de la classe.
     * Public = permet d'y acceder de partout.
     * Rien = permet d'y acceder uniquement dans le package 5com.FlorentL00.Miam.
     * Protected = decrit plus tard
     */
    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuir(int temperature, int duree) {
        if (temperature < 40 || temperature > 250)
            throw new IllegalArgumentException("La température du four doit être comprise en 40 et 250 degrés");
        if (duree <= 0)
            throw new IllegalArgumentException("La durée doit être positive");
        System.out.println("Je cuis un plat à " + temperature + " degrés, pendant " + duree + " minutes.");
    }


    public void cuire(Aliment aliment){
        System.out.println("Je cuit un aliment : " + aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("avec une puissance de " + puissance + " degrés");
        aliment.estCuit = true;
        maintenir();
    }

    // exemple avec une methode, permet de structurer son code à linterieur d'une classe.
    private void maintenir(){
    }

    // Getter and Setter, code puis generate depuis la console.
    public int getPuissance(){
        return puissance;
    }

    public void setPuissqnce(int puissance){
        System.out.println("La puissance est modifiée");
        this.puissance = puissance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
