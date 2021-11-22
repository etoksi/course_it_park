package HW7;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Murka");
        Dog dog1 = new Dog("Jack");
        Dog dog2 = new Dog("Bob");
        Tiger tiger = new Tiger("Shere Khan");

        cat1.swim(15);
        cat1.run(350);
        cat2.run(80);
        dog1.swim(8);
        dog2.swim(15);
        dog1.run(450);
        dog2.run(800);
        tiger.swim(400);
        tiger.run(1000);
    }
}
