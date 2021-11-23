package HW7;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Cat catMurka = new Cat("Murka");
        Dog dogJack = new Dog("Jack");
        Dog dogBob = new Dog("Bob");
        Tiger tigerShereKhan = new Tiger("Shere Khan");

        catBarsik.swim(15);
        catBarsik.run(350);
        catMurka.run(80);
        dogJack.swim(8);
        dogBob.swim(15);
        dogJack.run(450);
        dogBob.run(800);
        tigerShereKhan.swim(400);
        tigerShereKhan.run(1000);
    }
}
