package miage.al3c.g4.coachi.Utilitaire;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;

import miage.al3c.g4.coachi.Enum.Boisson;
import miage.al3c.g4.coachi.Enum.Nourriture;
import miage.al3c.g4.coachi.Utilitaire.Badge;

public class Inventaire {
    private HashMap<String, Integer> stock;

    public Inventaire() {
        this.stock = new HashMap<String, Integer>();
        initializeStock();
    }

    public void initializeStock(){
        this.stock.put("Croquettes",0);
        this.stock.put("Pâté",0);
        this.stock.put("Friandises",0);
        this.stock.put("Jouet",0);
        this.stock.put("Collier",0);
        this.stock.put("Brosse",0);
        this.stock.put("Lait",0);
        this.stock.put("Eau",0);
    }

    public void fillStock(String ident, int Usable){
        this.stock.put(ident, Usable);
    }

    //Récupérer le stock de nourriture suivant le type de nourriture demander

    public int getFoodStock(Nourriture n){
        switch(n){
            case Croquettes:
                return this.stock.get("Croquettes");
            case Pâté:
                return this.stock.get("Pâté");
            default:
                return(0);
        }
    }

    //Récupérer le stock de boissons suivant le type de boissons demander

    public int getBoissonStock(Boisson b){
        switch(b){
            case Eau:
                return this.stock.get("Eau");
            case Lait:
                return this.stock.get("Lait");
            default:
                return(0);
        }
    }

    public void beenUsed(String ident, int toRemove){
        this.stock.put(ident, this.stock.get(ident) - toRemove);
    }

    public void addItem(String nomItem, int toAdd){
        this.stock.put(nomItem, this.stock.get(nomItem) != null ? this.stock.get(nomItem) : toAdd);
    }

    public void getItem(String nomItem){
        this.stock.get(nomItem);
    }

    public void useAccessory(String nomUtilitaire, int toRemove){
        this.stock.put(nomUtilitaire, this.stock.get(nomUtilitaire) - toRemove);
    }

}
