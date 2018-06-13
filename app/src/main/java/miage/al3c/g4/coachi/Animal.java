package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Enum.Boisson;
import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;
import miage.al3c.g4.coachi.Enum.Nourriture;
import miage.al3c.g4.coachi.Utilitaire.Maladie;

public class Animal {

    private String nom;
    private int age;
    private int energieP;
    private int santeP;
    private int moralP;

    public Animal() {
        this.nom = "Pongo";
        this.age = 4;
        this.energieP = 100;
        this.santeP = 100;
        this.moralP = 100;
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.energieP = 100;
        this.santeP = 100;
        this.moralP = 100;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergieP() {
        return energieP;
    }

    public void setEnergieP(int energieP) {
        this.energieP = energieP;
    }

    public int getSanteP() {
        return santeP;
    }

    public void setSanteP(int santeP) {
        this.santeP = santeP;
    }

    public int getMoralP() {
        return moralP;
    }

    public void setMoralP(int moralP) {
        this.moralP = moralP;
    }

    void nourrir(Nourriture nourriture) {
        System.out.println("Nourriture : " + nourriture.toString());
    }

    void abreuver(Boisson boisson) {
        System.out.println("Boisson : " + boisson.toString());
    }
}
