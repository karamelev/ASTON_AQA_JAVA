package Lesson_7.Exceptions;

public class MyArrayDataException extends Exception {
    public MyArrayDataException (int i, int j) {
            super("Неверные данные в ячейке [" + i + "][" + j + "]");
    }
}
