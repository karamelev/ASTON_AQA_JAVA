package Lesson_7.Exceptions;

public class MyArraySizeException extends Throwable {
    public MyArraySizeException() {
        super("Массив должен иметь размер 4х4");
    }
}
