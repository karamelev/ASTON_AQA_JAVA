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

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@mail.ru", "+375(25)123-45-67", 1000, 55);
        employees[1] = new Employee("Петров Петр Петрович", "Программист", "petrov@gmail.com", "+375(29)765-43-21", 2000, 28);
        employees[2] = new Employee("Сидорова Анна Игоревна", "Бухгалтер", "sidorova@yandex.ru", "+375(33)111-22-33", 1200, 42);
        employees[3] = new Employee("Кузнецов Дмитрий Владимирович", "Дизайнер", "kuznetsov@rambler.ru", "+375(25)444-55-66", 1500, 31);
        employees[4] = new Employee("Морозова Елена Викторовна", "HR-менеджер", "morozova@mail.ru", "+375(44)777-88-99", 1250, 27);

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.info();
            }
        }
    }
}
