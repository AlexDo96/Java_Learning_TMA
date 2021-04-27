package Day02;

import java.util.Scanner;

public class Demo8 {
    /*Ham:
    - Ham ko co gia tri tra ve: void
    - Ham co gia tri tra ve: int, double, string,...
    + Ham co tham so truyen vao -> Truyen dung so luong tham so va kieu tham so
    + Ham ko co tham so truyen vao
    - Chuong trinh luon chay o ham Main

     */
    public static void main(String[] args) {
        Hello();
        Hi();

        Scanner scanner = new Scanner(System.in);   //cho phep user input data

        System.out.print("\nPlease input cd : ");
        double cd = scanner.nextDouble();

        System.out.print("Please input cr : ");
        double cr = scanner.nextDouble();

        HCN(cd,cr);

        System.out.print("\nPlease input Toan : ");
        double toan = scanner.nextDouble();

        System.out.print("Please input Ly : ");
        double ly = scanner.nextDouble();

        System.out.print("Please input Hoa : ");
        double hoa = scanner.nextDouble();

        AverageScore(toan, ly, hoa);

        System.out.print("\nDone");
    }

    public static void Hello(){
        System.out.println("Hello World");
    }

    public static void Hi(){
        System.out.println("Hi");
    }

    public static void HCN(double cd, double cr){
        double area_hcn = (cd + cr) * 2;
        double perimeter_hcn = cd * cr;

        System.out.println("Area: " + area_hcn);
        System.out.println("Perimeter: " + perimeter_hcn);
    }


    public static void AverageScore(double toan, double ly, double hoa){
        double average = (toan * 3 + ly * 2 + hoa) / 6;
        System.out.println("Average : " + average);
    }
}
