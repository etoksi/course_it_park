package Cars;

import java.util.Random;

public class CarsMain {

    public static void main(String[] args) {

        Automobile[] automobiles = new Automobile[10];
        automobiles[0] = new Car("renault", "a001ac01");
        automobiles[1] = new Truck("man", "a002ac01");
        automobiles[2] = new Car("ford", "a003ac01");
        automobiles[3] = new Truck("nissan", "a004ac01");
        automobiles[4] = new Car("cooper", "a005ac01");
        automobiles[5] = new Truck("volvo", "a006ac01");
        automobiles[6] = new Car("toyota", "a007ac01");
        automobiles[7] = new Truck("ram", "a008ac01");
        automobiles[8] = new Car("skoda", "a009ac01");
        automobiles[9] = new Truck("GMC", "a010ac01");

        moveAutos(automobiles);
    }

    private static void moveAutos(Automobile[] automobiles) {
        Random random = new Random();
        for (Automobile auto : automobiles) {
            auto.move(random.nextInt(1000));
        }
    }
}
