package Lesson_7;


import Lesson_7.Exceptions.MyArrayDataException;
import Lesson_7.Exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "h", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"13", "14", "15", "16"}
        };

        Matrix matrix = new Matrix();

        try {
            matrix.matrixSum(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
