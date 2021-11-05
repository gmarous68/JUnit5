package craighawkins.section2;

public class Circle {
    private final int radius;
    private final double PI = 3.14;

    public Circle(int radius) {
        if (radius <= 0 || radius > 100) {
            throw new RuntimeException();
        }
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getDiameter() {
        return this.radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * this.radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }
}
