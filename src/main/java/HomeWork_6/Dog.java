package HomeWork_6;

public class Dog extends Animal {
    // Свой собственный собачий Count
    public static int Count;

    public Dog(String name, String color, int age) {
        // Конструктор животного задаст значения полям, увеличит счетчик животных родительского класса
        super(name, color, age);

        // Зададим ограничения для собак
        limitationForRun = 500;
        limitationForSwim = 10;

        // Увеличим местный собачий счетчик
        Count++;
    }

    @Override
    protected void swim(int distance) {
        if (distance <= limitationForSwim)
            // Вызовем swim из предка, чтобы вывести сообщение о том, сколько проплыла собака
            super.swim(distance);
        else
            System.out.println(name + " не проплывет " + distance + "м!");
    }
}
