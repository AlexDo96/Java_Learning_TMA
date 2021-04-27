package Day01;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //cho phep user input data

        System.out.print("Please input a : ");
        double a = scanner.nextDouble();

        double area_hv = a * a;
        double perimeter_hv = a * 4;

        System.out.println("Area: " + area_hv);
        System.out.println("Perimeter: " + perimeter_hv);


        System.out.print("\nPlease input cd : ");
        double cd = scanner.nextDouble();

        System.out.print("Please input cr : ");
        double cr = scanner.nextDouble();

        double area_hcn = (cd + cr) * 2;
        double perimeter_hcn = cd * cr;

        System.out.println("Area: " + area_hcn);
        System.out.println("Perimeter: " + perimeter_hcn);


        System.out.print("\nPlease input Toan : ");
        double toan = scanner.nextDouble();

        System.out.print("Please input Ly : ");
        double ly = scanner.nextDouble();

        System.out.print("Please input Hoa : ");
        double hoa = scanner.nextDouble();

        double average = (toan * 3 + ly * 2 + hoa) / 6;
        System.out.println("Average : " + average);

        System.out.print("\nPlease input temperature C: ");
        double cdegree = scanner.nextDouble();

        double fdegree = cdegree * 18 + 32;
        System.out.println("F Degree : " + fdegree);

    }
}
