package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Utilitaire.Inventaire;

public class Utilisateur {

    private String email;

    private String pwd;
    private Animal animal;
    private Inventaire inventaire;
    private int sommePossedee;
    private int sommmeDepensee;
    private int pointsUtilisateurs;

    public Utilisateur(String email, String pwd, Inventaire inventaire) {
        this.email = email;
        this.pwd = pwd;
        this.inventaire = inventaire;
        this.sommePossedee = 999;
        this.sommmeDepensee = 0;
        this.pointsUtilisateurs = 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public int getSommePossedee() {
        return sommePossedee;
    }

    public void setSommePossedee(int sommePossedee) {
        this.sommePossedee = sommePossedee;
    }

    public int getPointsUtilisateurs() {
        return pointsUtilisateurs;
    }

    public void setPointsUtilisateurs(int pointsUtilisateurs) {
        this.pointsUtilisateurs = pointsUtilisateurs;
    }

    public int getSommmeDepensee() {
        return sommmeDepensee;
    }

    public void setSommmeDepensee(int sommmeDepensee) {
        this.sommmeDepensee = sommmeDepensee;
    }
}
