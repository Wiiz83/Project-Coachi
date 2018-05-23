package miage.al3c.g4.coachi.Utilitaire;

import java.util.ArrayList;

public class Medicament {

    private String nomMedicament;
    private String descriptionMedicament;
    private ArrayList<Maladie> maladiesSoignees;

    public Medicament(String nomMedicament, String descriptionMedicament, ArrayList<Maladie> maladiesSoignees) {
        this.nomMedicament = nomMedicament;
        this.descriptionMedicament = descriptionMedicament;
        this.maladiesSoignees = maladiesSoignees;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public String getDescriptionMedicament() {
        return descriptionMedicament;
    }

    public void setDescriptionMedicament(String descriptionMedicament) {
        this.descriptionMedicament = descriptionMedicament;
    }

    public ArrayList<Maladie> getMaladiesSoignees() {
        return maladiesSoignees;
    }

    public void setMaladiesSoignees(ArrayList<Maladie> maladiesSoignees) {
        this.maladiesSoignees = maladiesSoignees;
    }
}
