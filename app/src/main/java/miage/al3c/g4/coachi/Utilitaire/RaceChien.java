package miage.al3c.g4.coachi.Utilitaire;

import java.util.ArrayList;

import miage.al3c.g4.coachi.Enum.Caractere;
import miage.al3c.g4.coachi.Enum.Poil;

public class RaceChien {

    private String nomRace;
    private String descriptionRace;
    private Long poidsFemelleRace;
    private Long poidsMaleRace;
    private Long tailleFemelleRace;
    private Long tailleMaleRace;
    private ArrayList<Caractere> caracteresRace;
    private Long esperanceVieRace;
    private String varieteRace;
    private Poil poilsRace;
    private ArrayList<Maladie> maladiesRace;

    public RaceChien(String nomRace, String descriptionRace, Long poidsFemelleRace, Long poidsMaleRace, Long tailleFemelleRace, Long tailleMaleRace, ArrayList<Caractere> caracteresRace, Long esperanceVieRace, String varieteRace, Poil poilsRace, ArrayList<Maladie> maladiesRace) {
        this.nomRace = nomRace;
        this.descriptionRace = descriptionRace;
        this.poidsFemelleRace = poidsFemelleRace;
        this.poidsMaleRace = poidsMaleRace;
        this.tailleFemelleRace = tailleFemelleRace;
        this.tailleMaleRace = tailleMaleRace;
        this.caracteresRace = caracteresRace;
        this.esperanceVieRace = esperanceVieRace;
        this.varieteRace = varieteRace;
        this.poilsRace = poilsRace;
        this.maladiesRace = maladiesRace;
    }

    public String getNomRace() {
        return nomRace;
    }

    public void setNomRace(String nomRace) {
        this.nomRace = nomRace;
    }

    public String getDescriptionRace() {
        return descriptionRace;
    }

    public void setDescriptionRace(String descriptionRace) {
        this.descriptionRace = descriptionRace;
    }

    public Long getPoidsFemelleRace() {
        return poidsFemelleRace;
    }

    public void setPoidsFemelleRace(Long poidsFemelleRace) {
        this.poidsFemelleRace = poidsFemelleRace;
    }

    public Long getPoidsMaleRace() {
        return poidsMaleRace;
    }

    public void setPoidsMaleRace(Long poidsMaleRace) {
        this.poidsMaleRace = poidsMaleRace;
    }

    public Long getTailleFemelleRace() {
        return tailleFemelleRace;
    }

    public void setTailleFemelleRace(Long tailleFemelleRace) {
        this.tailleFemelleRace = tailleFemelleRace;
    }

    public Long getTailleMaleRace() {
        return tailleMaleRace;
    }

    public void setTailleMaleRace(Long tailleMaleRace) {
        this.tailleMaleRace = tailleMaleRace;
    }

    public ArrayList<Caractere> getCaracteresRace() {
        return caracteresRace;
    }

    public void setCaracteresRace(ArrayList<Caractere> caracteresRace) {
        this.caracteresRace = caracteresRace;
    }

    public Long getEsperanceVieRace() {
        return esperanceVieRace;
    }

    public void setEsperanceVieRace(Long esperanceVieRace) {
        this.esperanceVieRace = esperanceVieRace;
    }

    public String getVarieteRace() {
        return varieteRace;
    }

    public void setVarieteRace(String varieteRace) {
        this.varieteRace = varieteRace;
    }

    public Poil getPoilsRace() {
        return poilsRace;
    }

    public void setPoilsRace(Poil poilsRace) {
        this.poilsRace = poilsRace;
    }

    public ArrayList<Maladie> getMaladiesRace() {
        return maladiesRace;
    }

    public void setMaladiesRace(ArrayList<Maladie> maladiesRace) {
        this.maladiesRace = maladiesRace;
    }
}
