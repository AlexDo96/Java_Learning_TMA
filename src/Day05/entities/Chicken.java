package Day05.entities;

public class Chicken extends Animal {
    public Chicken() {
    }

    public Chicken(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + " keu o o o");
    }

}
