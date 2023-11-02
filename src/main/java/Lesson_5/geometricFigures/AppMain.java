package Lesson_5.geometricFigures;

public class AppMain {
    public static void main(String[] args) {
        Cycle cycle = new Cycle("green", "red", 5);
        System.out.println("Circle area: = " + cycle.getArea());
        System.out.println("Circle perimeter: = " + cycle.getPerimeter());
        System.out.println("Circle fill color:" + cycle.fillColor);
        System.out.println("Circle border color :" + cycle.borderColor);
        System.out.println("----------------------------------------");

        Rectangle square = new Rectangle("yellow", "black", 11.23,16);
        System.out.println("Rectangle area = " + square.getArea());
        System.out.println("Rectangle perimeter = " + square.getPerimeter());
        System.out.println("Rectangle fill color: " + square.fillColor);
        System.out.println("Rectangle border color: " + square.borderColor);
        System.out.println("----------------------------------------");


        Triangular triangular = new Triangular("white", "blue", 3,4,5);
        System.out.println("Triangular area = " + triangular.getArea());
        System.out.println("Triangular perimeter = " + triangular.getPerimeter());
        System.out.println("Triangular fill color: " + triangular.fillColor);
        System.out.println("Triangular border color: " + triangular.borderColor);
        System.out.println("----------------------------------------");

    }


}
