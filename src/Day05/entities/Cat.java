package Day05.entities;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(this.getName() + " keu meo meo");
    }

}
