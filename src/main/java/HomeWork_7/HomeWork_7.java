package HomeWork_7;

public class HomeWork_7 {
    private static final int CAT_COUNT = 5;

    public static void main(String[] args) {
        Cat[] cat = new Cat[CAT_COUNT];

        cat[0] = new Cat("Cat1", 20);
        cat[1] = new Cat("Cat2", 15);
        cat[2] = new Cat("Cat3", 20);
        cat[3] = new Cat("Cat4", 100);
        cat[4] = new Cat("Cat5", 30);

        Plate plate = new Plate(100);
        plate.info();

        for (int i = 0; i < CAT_COUNT; i++) {
            cat[i].eat_Task_3_4(plate);

            System.out.println(cat[i].toString());
        }

        plate.info();

        System.out.println("Добавим в тарелку 50 граммов еды.");
        plate.add(50);
        plate.info();
    }
}
