package Lesson_4;

public class Employee {

    private String lastName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    public int age;

    public Employee(String lastName, String position, String email, String phone, int salary, int age) {
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public  void info () {
        System.out.println("ФИО: " + lastName + "; Должность: " + position + "; email: " + email
                            + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст :" + age);
    }
}
