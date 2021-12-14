package CarCheckPoint;

public abstract class Auto implements Movable {

    protected final String number;
    protected final int speed;
    protected final double weight;
    protected final Size size;

    protected Auto(String number, int speed, double weight, Size size) {
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.size = size;
    }

    @Override
    public void move() {
        checkSpeed();
        if(!checkWeight()){
            throw new ViolationException(this.getClass().getSimpleName() + " " + this.number + " can't move through control point. Overweight!!");
        }
        else if(!checkSize()){
            throw new ViolationException(this.getClass().getSimpleName() + " " + this.number + " exceeds maximal dimensions.");
        }
        System.out.println(this.getClass().getSimpleName() + " " + this.number + " successfully passed checkpoint.");
    }

    private void checkSpeed() {
        if(this.speed == 0){
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " " + this.number + " does not move.");
        }
        else if(this.speed < 0){
            throw new IllegalArgumentException("Negative value not allowed here!!!");
        }
        else if(SPEED_LIMIT_1 <= this.speed && this.speed < SPEED_LIMIT_2){
            throw new ViolationException(this.getClass().getSimpleName() + " " + this.number + " violated the speed limit of " + SPEED_LIMIT_1);
        }
        else if(this.speed >= SPEED_LIMIT_2){
            throw new ViolationException(this.getClass().getSimpleName() + " " + this.number + " violated the speed limit of " + SPEED_LIMIT_2 + ". Police car is already heading to intruder.");
        }
    }

    private boolean checkWeight() {
        return this.weight >= MAX_WEIGHT;
    }

    private boolean checkSize() {
        return this.size.height >= MAX_HEIGHT || this.size.length >= MAX_LENGTH;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + number + ", speed: " + speed + ", weight: " + weight + ", size: " +
                size.length + "*" + size.height + "*" + size.width;
    }
}
