package miage.al3c.g4.coachi;

import java.util.ArrayList;

import miage.al3c.g4.coachi.Utilitaire.Ami;
import miage.al3c.g4.coachi.Utilitaire.Badge;
import miage.al3c.g4.coachi.Utilitaire.Habitude;
import miage.al3c.g4.coachi.Utilitaire.TestPersonalitee;

public class Utilisateur {

    private String prenom;
    private String nom;
    private Long age;
    private String sexe;
    private ArrayList<Habitude> habitudes;
    private ArrayList<Ami> amis;
    private TestPersonalitee testPersonalite;
    private ArrayList<Badge> badges;
    private ArrayList<Animal> animaux;

    public Utilisateur(String prenom, String nom, Long age, String sexe, ArrayList habitudes, ArrayList amis, TestPersonalitee testPersonalite, ArrayList badges) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.habitudes = habitudes;
        this.amis = amis;
        this.testPersonalite = testPersonalite;
        this.badges = badges;
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

    public void setHabitudes(ArrayList habitudes) {
        this.habitudes = habitudes;
    }

    public void addHabitude(Habitude habitude) {
        this.habitudes.add(habitude);
    }

    public ArrayList getAmis() {
        return amis;
    }

    public void setAmis(ArrayList amis) {
        this.amis = amis;
    }

    public void addAmi(Ami ami) {
        this.amis.add(ami);
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

    public void setBadges(ArrayList badges) {
        this.badges = badges;
    }

    public void addBadge(Badge badge) {
        this.badges.add(badge);
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux;
    }

    public void setAnimaux(ArrayList<Animal> animaux) {
        this.animaux = animaux;
    }

    public void addAnimal(Animal animal) {
        this.animaux.add(animal);
    }
}
