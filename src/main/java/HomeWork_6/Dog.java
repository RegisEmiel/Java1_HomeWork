package HomeWork_6;

public class Dog extends Animal {
    public static int Count;

    public Dog() {
        Count++;
    }

    public Dog(String name, String color, int age) {
        super(name, color, age);

        Count++;
    }
}
