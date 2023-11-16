package Lesson_9;

import java.util.List;

    public class CollectionManipulation {

        List <String> collection = List.of("Highload", "High", "Load", "Highload");

        public  void countWord () {
            long countHighload = collection.stream().filter(s -> s.equals("Highload")).count();
            System.out.println("Слово 'Highload' встречается " + countHighload + " раз");
        }

        public void firstWord () {
            String firstWord = collection.stream().findFirst().orElse("0");;
            System.out.println("Первым элементом в коллекции является слово " + firstWord);
        }

        public void lastElements () {
            String lastElement = collection.stream().reduce((first, second)-> second).orElse("0");
            System.out.println("Последним элементом в коллекции является слово " + lastElement);
        }
    }
