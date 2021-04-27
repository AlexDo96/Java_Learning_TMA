package Day05.entities;

public class Duck extends Animal {
    public Duck() {
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + " keu cap cap");
    }

}
