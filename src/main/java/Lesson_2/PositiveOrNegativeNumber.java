package Lesson_2;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

    public static void positiveOrNegativeNumber () {
        Scanner in = new Scanner(System.in);
        System.out.println("введите число");
        int a = in.nextInt();
        if (a >= 0) {
            System.out.println("введенное число положительное");
        } else {
            System.out.println("введенное число отрицательное");
        }
    }

    public static void main(String[] args) {
        positiveOrNegativeNumber();
    }
}
