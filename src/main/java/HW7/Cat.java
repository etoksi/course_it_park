package HW7;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Cats can't swim! " + super.getName() + " swam 0 meters");
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= 200) {
            super.run(runDistance);
        } else {
            System.out.println(super.getName() + " run only 200 meters.");
        }
    }
}
