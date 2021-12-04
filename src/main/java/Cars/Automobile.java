package Cars;

public abstract class Automobile {

    private String model;
    private String number;

    protected Automobile(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public abstract void move(double moveDistance);
}
