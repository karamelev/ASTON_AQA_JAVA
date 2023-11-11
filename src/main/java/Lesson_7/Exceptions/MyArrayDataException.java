package Lesson_7.Exceptions;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException (int i, int j) {
            super("Неверные данные в ячейке [" + i + "][" + j + "]");
    }

    public void printStackTrace() {
    }
}
