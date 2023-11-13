package Lesson_8;

import java.util.Set;

public class MainForPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Кузнецов","+375 29 633 14 14");
        phoneBook.add("Кузнецов","+375 33 713 25 90");
        phoneBook.add("Валодина","+375 29 122 48 67");
        phoneBook.add("Каверин","+375 44 825 67 15");

        System.out.println("Phone numbers for Барановф: " + phoneBook.get("Баранов"));
        System.out.println("Phone numbers for Кузнецовф: " + phoneBook.get("Кузнецов"));
        System.out.println("Phone numbers for Валодиной: " + phoneBook.get("Валодина"));
        System.out.println("Phone numbers for Каверинф: " + phoneBook.get("Каверин"));


        }

    }




