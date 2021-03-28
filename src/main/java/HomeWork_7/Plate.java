package HomeWork_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n)
            food -= n;
    }

    public boolean decreaseFood_Task_3_4(int n) {
        if (food >= n) {
            food -= n;

            return true;
        }

        return false;
    }

    public void add(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
