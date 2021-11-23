package HW7;

public class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= MAX_SWIM_DISTANCE) {
            super.swim(swimDistance);
        } else {
            System.out.println(super.getName() + " swam only 10 meters");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= MAX_RUN_DISTANCE) {
            super.run(runDistance);
        } else {
            System.out.println(super.getName() + " run only 500 meters");
        }
    }
}
