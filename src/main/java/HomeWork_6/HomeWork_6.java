package HomeWork_6;

public class HomeWork_6 {
    public static void main(String[] args) {
        Cat barsikCat = new Cat("Barsik", "White", 1);
        Dog sharikDog = new Dog("Sharik", "Black", 2);

        barsikCat.run(100);
        barsikCat.swim(25);
        sharikDog.run(150);

        System.out.println(Animal.Count);
        System.out.println(Cat.Count);
        System.out.println(Dog.Count);
    }
}
