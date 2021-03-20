package HomeWork_6;

public class Cat extends Animal{
    public static int Count;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        super(name, color, age);

        Count++;
    }
}
