package Lesson_2;

import java.util.Scanner;

public class PrintColor {
    public void printColor () {

        System.out.println("ВВедите value: ");
        Scanner in  = new Scanner(System.in);
        int value = in.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
            return;
        } if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
