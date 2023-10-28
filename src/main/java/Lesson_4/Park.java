package Lesson_4;

public class Park {

    private String namePark;
    private String location;

    public Park(String namePark, String location) {
        this.namePark = namePark;
        this.location = location;
    }

    public class Attraction {
        private String nameAttraction;
        private String openingTime;
        private String closingTime;
        private double price;

        public Attraction(String nameAttraction, String openingTime, String closingTime, double price) {
            this.nameAttraction = nameAttraction;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.price = price;
        }

        public void printAttraction() {
            System.out.println(" Парк: " + namePark + "\n Локация: " + location + "\n Название аттракциона: "
                    + nameAttraction + "\n время работы: с " + openingTime + " до " + closingTime + "\n цена: " + price);
            System.out.println("_________________________");
        }
    }
}






