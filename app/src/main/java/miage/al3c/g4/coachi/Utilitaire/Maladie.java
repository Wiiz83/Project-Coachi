package miage.al3c.g4.coachi.Utilitaire;

public class Maladie {

    private String nomMaladie;
    private String descriptionMaladie;
    private String malusEnergie;
    private String malusSante;
    private String malusMoral;
    private String frequenceTraitement;

    public Maladie(String nomMaladie, String descriptionMaladie, String malusEnergie, String malusSante, String malusMoral, String frequenceTraitement) {
        this.nomMaladie = nomMaladie;
        this.descriptionMaladie = descriptionMaladie;
        this.malusEnergie = malusEnergie;
        this.malusSante = malusSante;
        this.malusMoral = malusMoral;
        this.frequenceTraitement = frequenceTraitement;
    }

    public String getNomMaladie() {
        return nomMaladie;
    }

    public void setNomMaladie(String nomMaladie) {
        this.nomMaladie = nomMaladie;
    }

    public String getDescriptionMaladie() {
        return descriptionMaladie;
    }

    public void setDescriptionMaladie(String descriptionMaladie) {
        this.descriptionMaladie = descriptionMaladie;
    }

    public String getMalusEnergie() {
        return malusEnergie;
    }

    public void setMalusEnergie(String malusEnergie) {
        this.malusEnergie = malusEnergie;
    }

    public String getMalusSante() {
        return malusSante;
    }

    public void setMalusSante(String malusSante) {
        this.malusSante = malusSante;
    }

    public String getMalusMoral() {
        return malusMoral;
    }

    public void setMalusMoral(String malusMoral) {
        this.malusMoral = malusMoral;
    }

    public String getFrequenceTraitement() {
        return frequenceTraitement;
    }

    public void setFrequenceTraitement(String frequenceTraitement) {
        this.frequenceTraitement = frequenceTraitement;
    }
}
