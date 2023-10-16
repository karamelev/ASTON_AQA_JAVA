package Lesson_1;

public class CheckSumSign {
    public void checkSumSign () {
        int a = 10;
        int b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительная и равна: " + c);
        } else {
            System.out.println("сумма отрицательная и ровна: " + c);
        }
    }
}
