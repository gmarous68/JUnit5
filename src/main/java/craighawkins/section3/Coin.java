package craighawkins.section3;

import java.lang.Math;

public class Coin {
    static String flip() {
        double rand = Math.random(); //returns a value within [0, 1)
        if (rand < 0.5) return "heads";
        else return "tails";
    }
}