package Lesson_5.catAndDog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("cat", "Vaska", 200),
                new Dog("dog", "Bobik", 500, 10)
        };

        for (Animal elem : animals) {
            elem.run(600);
            elem.swim(200);

        }
        System.out.println("amount of animal: " + Animal.count);
        System.out.println("amount of cat: " + Cat.count);
        System.out.println("amount of dog: " + Dog.count);


        Cat[] cats = {
                new Cat("cat", "Murzik", 10, false),
                new Cat("cat", "Barsik", 15, false),
                new Cat("cat", "Vaska", 10, false),
        };

        Plate plate = new Plate(25);

        for (Cat cat : cats) {

            if (plate.food >= cat.appetite) {

                cat.eat(plate, cat.appetite);
                cat.satiety = true;
            }
            System.out.println(cat.name + "is satiety? " + cat.satiety);

            plate.info();
        }
    }
}
