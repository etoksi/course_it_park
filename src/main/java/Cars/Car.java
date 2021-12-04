package Cars;

public final class Car extends Automobile {
    private static final int MAX_DISTANCE = 500;

    public Car(String model, String number) {
        super(model, number);
    }

    @Override
    public void move(double moveDistance) {
        if (moveDistance <= MAX_DISTANCE) {
            System.out.println("Car " + getModel() + " with number " + getNumber() + " moved " + moveDistance + " kilometers");
        } else {
            System.out.println("Car " + getModel() + " with number " + getNumber() + " moved " + MAX_DISTANCE + " out of the " + moveDistance + ". Car is out of fuel.");

        }
    }
}
