package Lesson_1;

import java.util.Scanner;

public class CompareNumbers {
    public void compareNumbers () {
        System.out.println("введите значение а: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("введите значение b: ");
        int b = in.nextInt();

        if ( a >= b) {
            System.out.println("a >= b");
        }
            System.out.println("a < b");
    }
}
