package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Enum.Boisson;
import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;
import miage.al3c.g4.coachi.Enum.Nourriture;
import miage.al3c.g4.coachi.Utilitaire.Maladie;

public abstract class Animal {

    private String nom;
    private Long age;
    private Long taille;
    private Long poids;
    private int energieP;
    private int santeP;
    private int moralP;
    private String sante;
    private String hygiene;
    private Maladie maladie;

    public Animal(String nom, Long age, Long taille, Long poids, int energieP, int santeP, int moralP, String sante, String hygiene, Maladie maladie) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.energieP = energieP;
        this.santeP = santeP;
        this.moralP = moralP;
        this.sante = sante;
        this.hygiene = hygiene;
        this.maladie = maladie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getTaille() {
        return taille;
    }

    public void setTaille(Long taille) {
        this.taille = taille;
    }

    public Long getPoids() {
        return poids;
    }

    public void setPoids(Long poids) {
        this.poids = poids;
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

    public String getSante() {
        return sante;
    }

    public void setSante(String sante) {
        this.sante = sante;
    }

    public String getHygiene() {
        return hygiene;
    }

    public void setHygiene(String hygiene) {
        this.hygiene = hygiene;
    }

    public Maladie getMaladie() {
        return maladie;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }

    abstract void caresser();

    void nourrir(Nourriture nourriture) {
        System.out.println("Nourriture : " + nourriture.toString());
    }

    void abreuver(Boisson boisson) {
        System.out.println("Boisson : " + boisson.toString());
    }

    abstract void sortir();

    abstract void jouer(Jeu jeu);

    abstract void entrainer(Entrainement entrainement);

    abstract String parler();
}
