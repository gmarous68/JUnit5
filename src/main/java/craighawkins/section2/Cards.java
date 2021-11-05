package craighawkins.section2;

import java.util.*;

public class Cards {

    HashSet<String> suits = new HashSet<>();

    public Cards() {
        suits.add("hearts");
        suits.add("diamonds");
        suits.add("clubs");
        suits.add("spades");
    }

    public boolean isSuit(String suit) {
        return suits.contains(suit);
    }
}
