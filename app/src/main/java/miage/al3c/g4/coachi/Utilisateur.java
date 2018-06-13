package miage.al3c.g4.coachi;

import java.util.ArrayList;

import miage.al3c.g4.coachi.Utilitaire.Badge;
import miage.al3c.g4.coachi.Utilitaire.Habitude;
import miage.al3c.g4.coachi.Utilitaire.Inventaire;
import miage.al3c.g4.coachi.Utilitaire.TestPersonalitee;

public class Utilisateur {

    private String email;
    private String pwd;
    private Animal animal;
    private Inventaire inventaire;

    public Utilisateur(String email, String pwd, Inventaire inventaire) {
        this.email = email;
        this.pwd = pwd;
        this.inventaire = inventaire;
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

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public void setInventaire(Inventaire inventaire) {
        this.inventaire = inventaire;
    }
}
