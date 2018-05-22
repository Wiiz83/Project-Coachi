package miage.al3c.g4.coachi.Utilitaire;

import java.util.Dictionary;

import miage.al3c.g4.coachi.Enum.Boisson;
import miage.al3c.g4.coachi.Enum.Nourriture;

public class Inventaire {
    private int PoidsTotal;
    private Dictionary stock;

    public void initializeStock(){
        this.stock.put("Croquettes",0);
        this.stock.put("Lait",0);
        this.stock.put("Eau",0);
        this.stock.put("Pâté",0);
    }

    public void fillStock(String ident, int Usable){
        this.stock.put(ident, Usable);
    }

    //Récupérer le stock de nourriture suivant le type de nourriture demander

    public int getFoodStock(Nourriture n){
        switch(n){
            case Croquettes:
                return (int)this.stock.get("Croquettes");
            case Pâté:
                return (int)this.stock.get("pâté");
            default:
                return(0);
        }
    }

    //Récupérer le stock de boissons suivant le type de boissons demander

    public int getBoissonStock(Boisson b){
        switch(b){
            case Eau:
                return (int)this.stock.get("Eau");
            case Lait:
                return (int)this.stock.get("Lait");
            default:
                return(0);
        }
    }

    public void beenUsed(String ident, int toRemove){
        this.stock.put(ident, (int)this.stock.get(ident) - toRemove);
    }

    public void toAdd(String ident, int toAdd){
        this.stock.put(ident, (int)this.stock.get(ident) + toAdd);
    }

}
