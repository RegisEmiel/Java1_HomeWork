package HomeWork_6;

public class Dog extends Animal {
    public static int Count;

    public Dog() {
        limitationForRun = 500;
        limitationForSwim = 10;

        Count++;
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);

        limitationForRun = 500;
        limitationForSwim = 10;

        Count++;
    }
}
