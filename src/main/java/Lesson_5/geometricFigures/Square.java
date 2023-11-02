package Lesson_5.geometricFigures;

public class Square extends Figures implements Shape{
    double length;
    double width;

    public Square(String fillColor, String borderColor, double length, double width) {
        super(fillColor, borderColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
