package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Enum.Boisson;
import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;
import miage.al3c.g4.coachi.Enum.Nourriture;

abstract class Animal {

    private String nom;
    private Long age;
    private Long taille;
    private Long poids;
    private String sante;
    private String hygiene;

    public Animal(String nom, Long age, Long taille, Long poids, String sante, String hygiene) {
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.sante = sante;
        this.hygiene = hygiene;
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
