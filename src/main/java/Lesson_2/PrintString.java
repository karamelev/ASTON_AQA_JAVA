package Lesson_2;

public class PrintString {
    public static void printString (String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printString("Хахаха", 5);
    }
}
