package HomeWork_5;

public class HomeWork_5 {
    private static final int EMPLOYEES_COUNT = 5;

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEES_COUNT];

        employees[0] = new Employee("Иванов", "Оператор", "ivanov@email.ru", "+79261234567", 45000, 30);
        employees[1] = new Employee("Синицин", "Оператор", "sinicin@email.ru", "+79161342577", 45000, 45);
        employees[2] = new Employee("Зайцев", "Электрик", "zaicev@email.ru", "+79212536473", 40000, 44);
        employees[3] = new Employee("Петров", "Монтер", "petrov@email.ru", "+79251295542", 37000, 34);
        employees[4] = new Employee("Селина", "Кладовщик", "selina@email.ru", "+79101836797", 37000, 48);

        System.out.println("Java 1 Homework 5");
        System.out.println();
        System.out.println("Сотрудники старше 40 лет: ");
        for (Employee employee : employees)
            if (employee.getAge() > 40)
                employee.printInfo();
    }
}
