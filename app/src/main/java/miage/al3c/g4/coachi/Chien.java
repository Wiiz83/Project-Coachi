package miage.al3c.g4.coachi;


import java.util.Date;
import java.util.Random;

public class Chien extends Animal {

    private Date dtNeedLast;
    private Date dtFoodLast;
    private Date dtOutLast;
    private Date dtWaterLast;

    public Chien(String nom, int age) {
        super(nom, age);
    }

    public void needNeed() {
        Date l;
        l = new Date();
        int percent;
        Random r;
        int diff = new Date().compareTo(l);
        diff = diff / 3600;

        if (diff < 6) {
            switch (diff) {
                case 1:
                    percent = 20;
                    break;
                case 2:
                    percent = 40;
                    break;
                case 3:
                    percent = 60;
                    break;
                case 4:
                    percent = 80;
                    break;
                case 5:
                    percent = 90;
                    break;
                default:
                    percent = 0;
                    break;
            }
        } else if (diff > 6) {
            percent = 95;
        }

        r = new Random();
        int rand = r.nextInt(100) + 1;

    }

    public void needFood() {

    }

    public void needWater() {

    }

    public void needOut() {

    }

}
