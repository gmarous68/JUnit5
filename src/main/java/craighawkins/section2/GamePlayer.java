package craighawkins.section2;

public class GamePlayer {
    int[] coordinates = {0, 0}; //x, y pixel location

    public int[] getCoordinates() {
        return coordinates;
    }

    public void moveLeft() {
        coordinates[0] = coordinates[0] - 1;
    }

    public void moveRight() {
        coordinates[0] = coordinates[0] + 1;
    }

    public void moveUp() {
        coordinates[1] = coordinates[1] - 1;
    }

    public void moveDown() {
        coordinates[1] = coordinates[1] + 1;
    }
}
