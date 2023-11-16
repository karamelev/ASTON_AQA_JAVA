package Lesson_7;

import Lesson_7.Exceptions.MyArrayDataException;
import Lesson_7.Exceptions.MyArraySizeException;

public class Matrix {
    public void matrixSum (String [][] array) throws MyArraySizeException, MyArrayDataException {

            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException();
            }
       int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
