package craighawkins.section2;

public class GamePlayer2 {
    int[] coordinates = {0, 0}; //x, y pixel location

    public int[] getCoordinates() {
        return coordinates;
    }

    public void moveLeft() {
        if (coordinates[0] > 0) //should be > 0
            coordinates[0] = coordinates[0] - 1;
    }

    public void moveRight() {
        if (coordinates[0] < 1000)
            coordinates[0] = coordinates[0] + 1;
    }

    public void displayCoordinates() {
        System.out.println("x: " + coordinates[0] + ", y: " + coordinates[1]);
    }
}