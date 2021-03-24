package HomeWork_6;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    // Ограничения будем задавать в конструкторах классов-наследников
    protected int limitationForRun;
    protected int limitationForSwim;

    public static int Count;

    public Animal() {
        Count++;
    }

    public Animal(String name, String color, int age) {
        this();
        // Можно конструктор без параметров не вызывать, а тут же увеличить счетчик животных, но не в конструкторе
        // без параметра
        // Count++;

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

    // Можно и нужно сделать один методод на всех животных, так как поведение и для кошек, и для собак одинаковое
    protected void run(int distance) {
        // Ограничение на бег будет взято из объекта класса-наследника, а создать объект абстракного класса нельзя
        if (distance <= limitationForRun)
            System.out.println(name + " пробежал " + distance + "м.");
        else
            System.out.println(name + " не пробежит " + distance + "м!");
    }

    // Можно переопределить во всех наследниках, так как поведение в наследниках разное, а можно поступить, как в
    // предыдущем случае, и переопределить только для кошек
    protected void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м.");
    }
}
