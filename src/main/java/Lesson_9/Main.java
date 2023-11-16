package Lesson_9;


    public class Main {
            public static void main(String[] args) {
                EvenNumbersCounter counter = new EvenNumbersCounter();
                counter.generateRandomNumbers(10,-20,100);

                CollectionManipulation collectionManipulation = new CollectionManipulation();
                collectionManipulation.countWord();
                collectionManipulation.firstWord();
                collectionManipulation.lastElements();

                ValueСollection valueСollection = new ValueСollection();
                valueСollection.sortCollection();
            }
    }