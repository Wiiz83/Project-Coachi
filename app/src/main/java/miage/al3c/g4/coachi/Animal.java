package miage.al3c.g4.coachi;

import java.util.Date;

import static java.lang.Math.min;

public class Animal {

    private String nom;
    private int age;
    private int energieP;
    private int santeP;
    private int moralP;
    private Date lastJouer, lastNourir, lastAbreuver, lastSoigner, lastLaver, lastSortir;

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
        this.energieP = 50;
        this.santeP = 50;
        this.moralP = 50;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public int getEnergieP() {
        return energieP;
    }

    public int getSanteP() {
        return santeP;
    }

    public int getMoralP() {
        return moralP;
    }

    public void addBonus(int energie, int sante, int moral) {
        this.energieP = min(100, this.energieP + energie);
        this.santeP = min(100, this.santeP + sante);
        this.moralP = min(100, this.moralP + moral);
    }

    public void refreshStatus() {

    }
}
