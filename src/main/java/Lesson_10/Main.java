package Lesson_10;

    public class Main {
        public static void main(String[] args) {
            Box<Apple> appleBox1 = new Box<>();
            appleBox1.addFruit(new Apple());
            appleBox1.addFruit(new Apple());
            System.out.println("Weight of appleBox1: " + appleBox1.getWeight());

            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());
            System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

            Box<Apple> appleBox2 = new Box<>();
            appleBox2.addFruit(new Apple());
            System.out.println("Weight of appleBox2: " + appleBox2.getWeight());

            System.out.println("Comparing appleBox1 and orangeBox: " + appleBox1.compare(orangeBox));
            System.out.println("Comparing appleBox1 and appleBox2: " + appleBox1.compare(appleBox2));

            System.out.println("Transfer fruits from appleBox1 to appleBox2");
            appleBox1.transferFruitsToAnotherBox(appleBox2);
            System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
            System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        }
    }
