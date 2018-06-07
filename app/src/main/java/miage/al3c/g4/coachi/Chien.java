package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;
import miage.al3c.g4.coachi.Utilitaire.Maladie;
import miage.al3c.g4.coachi.Utilitaire.RaceChien;

public class Chien extends Animal {

    private RaceChien raceChien;

    public Chien(String nom, Long age, Long taille, Long poids, int energieP, int santeP, int moralP, String sante, String hygiene, Maladie maladie, RaceChien raceChien) {
        super(nom, age, taille, poids, energieP, santeP, moralP, sante, hygiene, maladie);
        this.raceChien = raceChien;
    }

    public RaceChien getRaceChien() {
        return raceChien;
    }

    public void setRaceChien(RaceChien raceChien) {
        this.raceChien = raceChien;
    }

    @Override
    void caresser() {

    }

    @Override
    void sortir() {

    }

    @Override
    void jouer(Jeu jeu) {

    }

    @Override
    void entrainer(Entrainement entrainement) {

    }

    @Override
    public String parler() {
        return "Wouaf Wouaf";
    }
}
