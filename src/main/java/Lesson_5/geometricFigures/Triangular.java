package Lesson_5.geometricFigures;

public class Triangular extends Figures implements Shape {

    double side1;
    double side2;
    double side3;

    public Triangular(String fillColor, String borderColor, double side1, double side2, double side3) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        return getPerimeter() / 2;
    }
}
