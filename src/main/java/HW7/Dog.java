package HW7;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void swim(int swimDistance) {
        if (swimDistance <= 10) {
            super.swim(swimDistance);
        } else {
            System.out.println(super.getName() + " swam only 10 meters");
        }
    }

    @Override
    public void run(int runDistance) {
        if (runDistance <= 500) {
            super.run(runDistance);
        } else {
            System.out.println(super.getName() + " run only 500 meters");
        }
    }
}
