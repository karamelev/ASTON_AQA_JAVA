package Lesson_9.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainForStudent {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)

        );

        double avgAgeStudent = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt(Student::getAge).average().orElse(0.0);
        System.out.println("средний возвраст студентов мужского пола : " + avgAgeStudent);

        List<Student> isRiskForArmy = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .sorted(Comparator.comparingInt(Student ::getAge))
                .collect(Collectors.toList());

        isRiskForArmy.forEach(System.out::println);

    }
}
