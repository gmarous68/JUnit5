package craighawkins.section2;

public class Rectangle {
    private final int height; //pixels
    private final int width; //pixels

    public Rectangle(int height, int width) {
        //the dimensions the rectangle must be within 1 and 1000 pixels
        if (height < 1 || width < 1 || height > 1000 || width > 1000) {
            throw new RuntimeException();
        }
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public boolean isSquare() {
        return height == width;
    }
}
