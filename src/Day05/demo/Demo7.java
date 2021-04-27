package Day05.demo;

import Day05.entities.*;

public class Demo7 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square((double) 5),
                new Rectangle((double) 4, (double) 6),
                new Square((double) 4),
                new Rectangle(3.5,4.5),
                new Square((double) 6)
        };

        System.out.println("Area and Perimeter of shapes: ");
        for (Shape shape : shapes) {
            shape.print();
            shape.printPerimeter();
            shape.printArea();
            System.out.println("-----------------");
        }
    }
}
