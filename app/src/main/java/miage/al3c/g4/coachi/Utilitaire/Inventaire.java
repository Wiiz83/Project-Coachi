package miage.al3c.g4.coachi.Utilitaire;

import java.util.HashMap;

import static java.lang.Math.max;

public class Inventaire {
    private HashMap<String, Integer> stock;

    public Inventaire() {
        this.stock = new HashMap<String, Integer>();
        initializeStock();
    }

    public void initializeStock() {
        this.stock.put("Croquettes", 0);
        this.stock.put("Pâté", 0);
        this.stock.put("Friandises", 0);
        this.stock.put("Jouet", 0);
        this.stock.put("Collier", 0);
        this.stock.put("Brosse", 0);
        this.stock.put("Lait", 0);
        this.stock.put("Eau", 0);
    }

    public void addItem(String nomItem, int toAdd) {
        this.stock.put(nomItem, this.stock.get(nomItem) == null ? toAdd : this.stock.get(nomItem) + toAdd);
    }

    public int getItem(String nomItem) {
        return this.stock.get(nomItem) == null ? 0 : this.stock.get(nomItem);
    }

    public void useItem(String nomItem, int toRemove) {
        this.stock.put(nomItem, this.stock.get(nomItem) == null ? 0 : max(this.stock.get(nomItem) - toRemove, 0));
    }

}
