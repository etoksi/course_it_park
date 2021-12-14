package CarCheckPoint;

public class Size {

    protected final double height;
    protected final double width;
    protected final double length;

    public Size(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
