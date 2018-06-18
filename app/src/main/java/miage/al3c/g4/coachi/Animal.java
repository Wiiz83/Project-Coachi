package miage.al3c.g4.coachi;

import java.util.Date;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Animal {

    private String nom;
    private int age;
    private int energieP;
    private int santeP;
    private int moralP;
    private Date lastJouer, lastNourir, lastAbreuver, lastSoigner, lastLaver, lastSortir;
    private String etat;

    public Animal() {
        this.nom = "Pongo";
        this.age = 4;
        this.energieP = 50;
        this.santeP = 50;
        this.moralP = 50;
        this.etat = "Normal";
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.energieP = 50;
        this.santeP = 50;
        this.moralP = 50;
        this.etat = "Normal";
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

    public void addBonus(int energie, int sante, int moral, String etat) {
        this.energieP = max(0, min(100, this.energieP + energie));
        this.santeP = max(0, min(100, this.santeP + sante));
        this.moralP = max(0, min(100, this.moralP + moral));
        this.etat = etat;
        if (this.energieP <= 20)
            this.etat = "Fatigué";
        if (this.santeP <= 20)
            this.etat = "Malade";
        if (this.moralP <= 20)
            this.etat = "Malheureux";
    }

    public String getEtat() {
        return etat;
    }
}
