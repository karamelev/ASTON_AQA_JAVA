package Lesson_5.catAndDog;

public class Cat extends Animal {

    public static int count;
    boolean satiety;
    int appetite;


    public Cat(String type, String name, int maxRunDistance) {
        super(type, name, maxRunDistance, 0);
        count ++;
    }

    public Cat(String type, String name, int appetite, boolean satiety) {
        super(type, name, 0, 0);
        this.appetite = appetite;
        this.satiety = satiety;
    }
}
