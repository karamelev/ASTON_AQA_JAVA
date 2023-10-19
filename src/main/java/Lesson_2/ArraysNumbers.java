
package Lesson_2;
import java.util.Arrays;


public class ArraysNumbers {
    public static void changeNumbers() {
        int [] array = {0,1,0,1,0,1,0,1,0,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else  {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayFill() {
        int [] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr [i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiplicationTwo () {
        int [] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                arr [i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squareArray(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
            }
        }
//        вывод на печать массива
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
    }

    public static void lengthsArray (int len, int initialValue) {
        int [] array = new int[len] ;
        for (int i = 0; i < array.length; i++) {
            array [i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

        public static void main (String[]args) {
           arrayFill();
           changeNumbers();
           multiplicationTwo();
           squareArray(5);
           lengthsArray(15, 123);
        }

}
