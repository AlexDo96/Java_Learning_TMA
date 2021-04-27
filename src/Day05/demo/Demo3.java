package Day05.demo;

import Day05.entities.Animal;
import Day05.entities.Cat;
import Day05.entities.Chicken;
import Day05.entities.Duck;

public class Demo3 {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Ca");
        animal1.sound();

        Animal animal2 = new Chicken("Ga");
        animal2.sound();

        Animal animal3 = new Duck("Donald");
        animal3.sound();

    }
}
