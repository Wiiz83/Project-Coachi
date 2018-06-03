package miage.al3c.g4.coachi;

import java.util.ArrayList;

import miage.al3c.g4.coachi.Utilitaire.Badge;
import miage.al3c.g4.coachi.Utilitaire.Habitude;
import miage.al3c.g4.coachi.Utilitaire.TestPersonalitee;

public class Utilisateur {

    private String email;
    private String pwd;
    private String prenom;
    private String nom;
    private Long age;
    private String sexe;
    private ArrayList<Habitude> habitudes;
    private TestPersonalitee testPersonalite;
    private ArrayList<Badge> badges;
    private Animal animal;

    public Utilisateur(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public ArrayList getHabitudes() {
        return habitudes;
    }

    public void setHabitudes(ArrayList<Habitude> habitudes) {
        this.habitudes = habitudes;
    }

    public void addHabitude(Habitude habitude) {
        this.habitudes.add(habitude);
    }

    public TestPersonalitee getTestPersonalite() {
        return testPersonalite;
    }

    public void setTestPersonalite(TestPersonalitee testPersonalite) {
        this.testPersonalite = testPersonalite;
    }

    public ArrayList getBadges() {
        return badges;
    }

    public void setBadges(ArrayList<Badge> badges) {
        this.badges = badges;
    }

    public void addBadge(Badge badge) {
        this.badges.add(badge);
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
