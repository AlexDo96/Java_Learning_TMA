package Day02;

import java.util.Scanner;

public class Demo7 {
    /*Yeu cau user nhap vao 2 so nguyen thuc hien cac yeu cau sau:
       1. Tong
       2. Hieu
       3. Tich
       4. Thuong
       Khi user chon menu nao se thuc hien va hien thi ket qua tuong ung.
       Sau do, yeu cau user nhan y(Y) de tiep tuc
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        String key;
        int a, b;


        do {
            System.out.print("Input a: ");
            a = scanner.nextInt();
            System.out.print("Input b: ");
            b = scanner.nextInt();
            System.out.println("1. Tong");
            System.out.println("2. Hieu");
            System.out.println("3. Tich");
            System.out.println("4. Thuong");


            System.out.print("Select Menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Ket qua a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("Ket qua a - b = " + (a - b));
                    break;
                case 3:
                    System.out.println("Ket qua a * b = " + (a * b));
                    break;
                case 4:
                    double result = (double) a / b;
                    System.out.println("Ket qua a / b = " + result);
                    break;
                default:
                    System.out.println("Menu Ko phu hop");
            }

            scanner.nextLine();
            System.out.print("Pres y(Y) to continue");
            key = scanner.nextLine();


        } while (key.equalsIgnoreCase("y"));
    }
}
