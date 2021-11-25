package Animals;

public class Tiger extends Animal {
    private static final String PRODUCED_SOUND = "growls";

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void produceSound(){
        super.produceSound();
        System.out.println(PRODUCED_SOUND);
    }
}
