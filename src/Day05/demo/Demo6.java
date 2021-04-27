package Day05.demo;

import Day05.entities.*;

/*
   Khai bao mang doi tuong 2
 */
public class Demo6 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Ca"),
                new Chicken("Ga"),
                new Duck("Donald"),
                new Chicken("Ga trong"),
                new Cat("Kitty"),
        };

        System.out.println("Animal sounds: ");
        for (Animal animal : animals) {
            animal.sound();
        }

    }
}
