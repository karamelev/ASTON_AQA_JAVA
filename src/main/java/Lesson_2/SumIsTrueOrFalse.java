package Lesson_2;

public class SumIsTrueOrFalse {
    public static boolean sumIsTrueOrFalse (int a , int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void main(String[] args) {
        System.out.println(sumIsTrueOrFalse(1,2));
    }
}
