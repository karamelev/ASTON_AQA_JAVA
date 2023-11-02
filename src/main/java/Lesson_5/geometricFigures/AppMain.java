package Lesson_5.geometricFigures;

public class AppMain {
    public static void main(String[] args) {
        Cycle cycle = new Cycle("Зеленый", "Красный", 5);
        System.out.println("Площадь круга = " + cycle.getArea());
        System.out.println("Периметр круга = " + cycle.getPerimeter());
        System.out.println("Цвет фона круга :" + cycle.fillColor);
        System.out.println("Цвет границ круга :" + cycle.borderColor);
        System.out.println("----------------------------------------");

        Square square = new Square("Желтый", "Черный", 11.23,16);
        System.out.println("Площадь прямоугольника = " + square.getArea());
        System.out.println("Периметр прямоугольника = " + square.getPerimeter());
        System.out.println("Цвет фона прямоугольника: " + square.fillColor);
        System.out.println("Цвет границ прямоугольника: " + square.borderColor);
        System.out.println("----------------------------------------");


        Triangular triangular = new Triangular("Белый", "Синий", 3,4,5);
        System.out.println("Площадь треугольника = " + triangular.getArea());
        System.out.println("Периметр треугольника = " + triangular.getPerimeter());
        System.out.println("Цвет фона треугольника: " + triangular.fillColor);
        System.out.println("Цвет границ треугольника: " + triangular.borderColor);
        System.out.println("----------------------------------------");

    }


}
