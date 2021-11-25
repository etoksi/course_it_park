package Animals;

public class AnimalsMain {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Dog dogBob = new Dog("Bob");
        Tiger tigerShereKhan = new Tiger("Shere Khan");
        Cow cowMilka = new Cow("Milka");
        Woolf woolfSeryj = new Woolf("Seryj");

        Animal[] animals = {catBarsik, dogBob, tigerShereKhan, cowMilka, woolfSeryj};
        for (Animal animal : animals) {
            animal.produceSound();
        }
    }
}
