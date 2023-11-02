package Lesson_5.geometricFigures;

public class Cycle extends Figures implements Shape {

    private double radius;

    public Cycle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return  (double) Math.round(2 * Math.PI * radius * 100) / 100;
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * (Math.pow(radius,2))*100) / 100;
    }
}
