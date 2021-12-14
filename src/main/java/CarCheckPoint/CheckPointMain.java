package CarCheckPoint;

import java.util.ArrayList;
import java.util.Random;

public class CheckPointMain {

    public static void main(String[] args) {
        
        ArrayList<Auto> autos = new ArrayList<>();
        Random random = new Random();
        generateAutos(autos, random);

        /* Я не очень представляю, как в данном случае сделать так,
        * чтобы информация выводилась по порядку, а не сначала успешные,
        * а потом сообщения об ошибках(или наоборот). Реализовывать семофор?*/
        for (Auto auto:autos) {
            try {
                auto.move();
            } catch (ViolationException e) {
                e.printStackTrace();
            }
        }
    }

    private static void generateAutos(ArrayList<Auto> autos, Random random) {
        for (int i = 1; i < 31; i++) {
            int type = random.nextInt(100);
            if (type %2 == 0){
                autos.add(new Car("a"+i, random.nextInt(150), random.nextInt(10),
                        new Size(random.nextInt(3), random.nextInt(3), random.nextInt(5) )));
            }
            else{
                autos.add(new Truck("a"+i, random.nextInt(150), random.nextInt(10),
                        new Size(random.nextInt(3), random.nextInt(3), random.nextInt(5) )));
            }
        }
    }
}
