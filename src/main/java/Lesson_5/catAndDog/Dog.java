package Lesson_5.catAndDog;

public class Dog extends Animal {

    public  static int count;

    public Dog(String type, String name, int maxRunDistance, int maxSwimDistance) {
        super("Собака", name, maxRunDistance, maxSwimDistance);
        count ++;
    }
}
