package Animals;

public class Cow extends Animal{
    private static final String PRODUCED_SOUND = "hums";

    public Cow(String name) {
        super(name);
    }

    @Override
    public void produceSound(){
        super.produceSound();
        System.out.println(PRODUCED_SOUND);
    }
}
