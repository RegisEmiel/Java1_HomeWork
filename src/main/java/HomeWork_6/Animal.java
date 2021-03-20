package HomeWork_6;

public class Animal {
    protected String name;
    protected String color;
    protected int age;

    public static int Count;

    public Animal() {
        Count++;
    }

    public Animal(String name, String color, int age) {
        this();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м.");
    }

    protected void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м.");
    }
}
