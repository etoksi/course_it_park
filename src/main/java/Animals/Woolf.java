package Animals;

public class Woolf extends Animal{
    private static final String PRODUCED_SOUND = "howls";

    public Woolf(String name) {
        super(name);
    }
    
    @Override
    public void produceSound(){
        super.produceSound();
        System.out.println(PRODUCED_SOUND);
    }
}
