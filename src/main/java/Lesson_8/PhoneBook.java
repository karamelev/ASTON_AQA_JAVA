package Lesson_8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String,Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        Set<String> phoneNumbers;

        if (phoneBook.containsKey(lastName)) {
            phoneNumbers = phoneBook.get(lastName);
            phoneNumbers.add(phoneNumber);
        } else {
            phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(lastName, phoneNumbers);
        }
    }
    public Set<String> get (String lastName) {
        return phoneBook.get(lastName);
    }
}

