package Lesson_5.catAndDog;

public abstract class Animal {

    public static int count;

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;


    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }


    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " пробежал " + distance + "м.");
        } else {
            System.out.println(type + " " + name + " не смог пробежать " + distance + "м.");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance <= 0) {
            System.out.println(type + " " + name + " не умеет плавать " + distance + "м.");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + "проплыл " + distance + "м.");
        } else {
            System.out.println(type + " " + name + "на смог проплыть " + distance + "м.");
        }
    }

    public void eat(Plate plate, int food) {
        plate.food -= food;
    }
}
