package CarCheckPoint;

public interface Movable {

    int SPEED_LIMIT_1 = 80;
    int SPEED_LIMIT_2 = 100;
    int MAX_WEIGHT = 8_000;
    int MAX_LENGTH = 4;
    double MAX_HEIGHT = 2.5;

    void move();
}
