package HomeWork_6;

public class Cat extends Animal{
    public static int Count;

    public Cat() {
        limitationForRun = 200;
        limitationForSwim = 0;
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);

        limitationForRun = 200;
        limitationForSwim = 0;

        Count++;
    }
}
