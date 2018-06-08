package miage.al3c.g4.coachi;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import java.util.Date;
import java.util.Random;

import miage.al3c.g4.coachi.Enum.Entrainement;
import miage.al3c.g4.coachi.Enum.Jeu;
import miage.al3c.g4.coachi.Utilitaire.Maladie;
import miage.al3c.g4.coachi.Utilitaire.RaceChien;

public class Chien extends Animal {

    private RaceChien raceChien;
    private Date dtNeedLast;
    private Date dtFoodLast;
    private Date dtOutLast;
    private Date dtWaterLast;


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

    public void needNeed(){
        Date l;
        l = new Date();
        int percent;
        Random r;
        int diff = new Date().compareTo(l);
        diff = diff/3600;

        if(diff < 6){
            switch(diff){
                case 1: percent = 20;
                break;
                case 2: percent = 40;
                break;
                case 3: percent = 60;
                break;
                case 4: percent = 80;
                break;
                case 5: percent = 90;
                break;
                default : percent = 0;
                break;
            }
        }else if(diff > 6){
            percent = 95;
        }

        r = new Random();
        int rand = r.nextInt(100)+1;

    }

    public void needFood(){

    }

    public void needWater(){

    }

    public void needOut(){

    }

}
