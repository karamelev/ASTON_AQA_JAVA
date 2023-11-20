package Lesson_10;

import java.util.ArrayList;
import java.util.List;

    public class Box <T extends Fruit> {
        private final List <T> fruits;

        public Box() {
            this.fruits = new ArrayList<>();
        }

        public void  addFruit (T fruit) {
            fruits.add(fruit);
        }

        public float getWeight() {
            float fruitWeight = 0.0f;

            if (!fruits.isEmpty()) {
                if (fruits.get(0) instanceof Apple) {
                    fruitWeight = fruits.size() * Apple.appleWeight;
                } else if (fruits.get(0) instanceof Orange) {
                    fruitWeight = fruits.size() * Orange.orangeWeight;
                }
            }
            return fruitWeight;
        }
        public boolean compare(Box<?> anotherBox) {
            return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
        }

        public void transferFruitsToAnotherBox(Box<T> anotherBox) {
            if (this == anotherBox) {
                return;
            }

            for (T fruit : fruits) {
                anotherBox.addFruit(fruit);
            }

            fruits.clear();
        }
    }
