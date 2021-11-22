package HW7;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void swim(int swimDistance) {
        System.out.println(this.name + " swam " + swimDistance + " meters");
    }

    public void run(int runDistance) {
        System.out.println(this.name + " run " + runDistance + " meters");
    }

    public String getName() {
        return name;
    }
}
