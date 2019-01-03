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
