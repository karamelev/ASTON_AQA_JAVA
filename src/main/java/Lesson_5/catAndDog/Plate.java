package Lesson_5.catAndDog;

public class Plate {

    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFoodInPlate (int addFood) {
        food += addFood;
    }

    public void info() {
        System.out.println("in a plate: " + food + " food");
    }
}



