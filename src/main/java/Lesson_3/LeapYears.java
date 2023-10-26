package Lesson_3;

public class LeapYears {
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }
}
