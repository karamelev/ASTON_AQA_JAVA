package Lesson_9;

import java.util.Arrays;
import java.util.List;

    public class ValueСollection{

        List<String> collection = Arrays.asList("f10", "f2", "f4","f15", "f4");

        public void sortCollection () {
            String[] sortedArray = collection.stream()
                    .sorted()
                    .toArray(String[]::new);

            System.out.println("Отсортированный массив:");
            Arrays.stream(sortedArray).forEach(System.out::println);
        }
    }
