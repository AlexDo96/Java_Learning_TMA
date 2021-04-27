package Day04.demo;

import Day04.entities.*;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Chieu dai: ");
        rectangle.setA(scanner.nextDouble());
        System.out.print("Chieu rong: ");
        rectangle.setB(scanner.nextDouble());

        rectangle.print();
    }

}
