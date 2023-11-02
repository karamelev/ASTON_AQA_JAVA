package Lesson_5.catAndDog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("кот", "Васька", 200),

                new Dog("Собака", "Бобик", 500, 10)
        };

        for (Animal elem : animals) {
            elem.run(600);
            elem.swim(200);

        }
//        System.out.println("Количество животных: " + Animal.count);
//        System.out.println("Количество котов: " + Cat.count);
//        System.out.println("Количество собак: " + Dog.count);


        Cat[] cats = {
                new Cat("кот", "Мурзик", 10, false),
                new Cat("кот", "Барсик", 15, false),
                new Cat("кот", "Васька", 10, false),
        };

        Plate plate = new Plate(25);

        for (Cat cat : cats) {

            if (plate.food >= cat.appetite) {

                cat.eat(plate, cat.appetite);
                cat.satiety = true;
            }
            System.out.println(cat.name + " сыт? " + cat.satiety);

            plate.info();
        }
    }
}
