package Lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class EvenNumbersCounter {

        protected void generateRandomNumbers(int countNumbers, int min, int max) {
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < countNumbers; i++) {
                numbers.add(random.nextInt(max - min + 1) + min);
            }
            System.out.println("Список случайно сгенерированных чисел" + numbers);

            long count = numbers.stream().filter(num -> num % 2 == 0).count();
            System.out.println("количество четных чисел :" +count);
        }
    }




