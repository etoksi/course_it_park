package HW7;

public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Cats can't swim! " + super.getName() + " swam 0 meters");
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE) {
            super.run(runDistance);
        } else {
            System.out.println(super.getName() + " run only 200 meters.");
        }
    }
}
