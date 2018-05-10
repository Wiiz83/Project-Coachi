package miage.al3c.g4.coachi;

import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;

public class Chien extends Animal {

    public Chien(String nom, Long age, Long taille, Long poids, String sante, String hygiene) {
        super(nom, age, taille, poids, sante, hygiene);
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
