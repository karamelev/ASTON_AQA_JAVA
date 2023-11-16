package Lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class UserLogins {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> logins = new ArrayList<>();

            System.out.println("Введите логины (для завершения введите пустую строку):");

            while (true) {
                String login = scanner.nextLine().trim();
                if (login.isEmpty()) {
                    break;
                }
                logins.add(login);
            }

            System.out.println("Логины, начинающиеся на букву 'f':");
            logins.stream()
                    .filter(login -> login.startsWith("f"))
                    .map(String::toLowerCase)
                    .forEach(System.out::println);

            scanner.close();
        }
    }

