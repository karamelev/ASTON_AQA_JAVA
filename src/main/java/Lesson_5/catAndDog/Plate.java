package Lesson_5.catAndDog;

public class Plate {

    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void addFoodInPlant (int addFood) {
        food += addFood;
    }

    public void info() {
        System.out.println("в тарелке: " + food + " еды");
    }
}



