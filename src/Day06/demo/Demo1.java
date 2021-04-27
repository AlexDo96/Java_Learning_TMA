package Day06.demo;

import Day06.entities.Human;
import Day06.entities.IB;
import Day06.entities.IC;
import Day06.entities.IHuman;


public class Demo1 {
    public static void main(String[] args) {
        IHuman human = new Human("Tuan Anh","male");
        human.run();
        human.eat();

        IB ib = new Human();
        ib.b1();
        ib.b2();

        IC ic = new Human();
        ic.c1();
        ic.c2();
    }
}
