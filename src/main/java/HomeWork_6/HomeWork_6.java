package HomeWork_6;

public class HomeWork_6 {
    public static void main(String[] args) {
        Cat barsikCat = new Cat("Barsik", "White", 1);
        Cat dymkaCat = new Cat("Dymka", "White", 1);
        Dog sharikDog = new Dog("Sharik", "Black", 2);

        barsikCat.run(100);
        barsikCat.swim(25);
        dymkaCat.run(70);
        sharikDog.run(150);
        sharikDog.swim(5);

        System.out.println("Животных: " + Animal.Count);
        System.out.println("Кошек: " + Cat.Count);
        System.out.println("Собак: " + Dog.Count);
    }
}
