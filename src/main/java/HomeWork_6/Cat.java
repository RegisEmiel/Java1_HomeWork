package HomeWork_6;

public class Cat extends Animal{
    // Свой собственный кошачий Count
    public static int Count;

    public Cat(String name, String color, int age) {
        // Конструктор животного задаст значения полям, увеличит счетчик животных родительского класса
        super(name, color, age);

        // Зададим ограничения для кошек
        limitationForRun = 200;
        limitationForSwim = 0;

        // Увеличим местный кошачий счетчик
        Count++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}
