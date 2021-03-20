package HomeWork_5;

public class Employee {
    private String FIO; //Вамилия, имя, отчество
    private String Position; // Должность
    private String Email; // Адрес электронной почты
    private String Phone; // Телефон
    private double Salary; // Зарплата
    private int Age; // Возраст

    // Конструктор по умолчанию
    public Employee() {
    }

    // Конструктор с параметрами
    public Employee(String FIO, String position, String email, String phone, double salary, int age) {
        this.FIO = FIO;
        Position = position;
        Email = email;
        Phone = phone;
        Salary = salary;
        Age = age;
    }

    // Методы доступа к закрытым членам класса
    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    // Переопределение функции toString
    @Override
    public String toString() {
        return "Employee{" +
                "FIO='" + FIO + '\'' +
                ", Position='" + Position + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Salary=" + Salary +
                ", Age=" + Age +
                '}';
    }

    // Функция вывода информации о сотруднике
    public void printInfo() {
        System.out.println(toString());
    }
}
