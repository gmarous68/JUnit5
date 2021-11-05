package craighawkins.section3;

import java.util.Set;
import java.util.HashSet;

public class ColorPalette {

    Set<String> colors = new HashSet<>();

    public ColorPalette() {
        colors.add("red");
        colors.add("orange");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("black");
        colors.add("white");
    }

    public boolean hasColor(String color) {
        return colors.contains(color);
    }
}