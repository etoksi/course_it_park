package Cars;

public final class Truck extends Automobile {

    private static final int MAX_DISTANCE = 1200;

    public Truck(String model, String number) {
        super(model, number);
    }

    @Override
    public void move(double moveDistance) {
        if (moveDistance <= MAX_DISTANCE) {
            System.out.println("Truck " + getModel() + " with number " + getNumber() + " moved " + moveDistance + " kilometers");
        } else {
            System.out.println("Truck " + getModel() + " with number " + getNumber() + " moved " + MAX_DISTANCE + " out of " + moveDistance + ". Truck is out of fuel.");

        }
    }
}
