package HomeWork_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void eat_Task_3_4(Plate p) {
        full = p.decreaseFood_Task_3_4(appetite);
    }

    @Override
    public String toString() {
        return name + " is full: " + full;
    }
}
