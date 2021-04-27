package Day01;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //cho phep user input data

        System.out.print("\nPlease input your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age : " + age);

        System.out.print("Please input your price: ");
        double price = scanner.nextDouble();
        System.out.println("Your price : " + price);

        System.out.print("Please input your status: ");
        boolean status = scanner.nextBoolean();
        System.out.println("Your status : " + status);

        scanner.nextLine(); //Khi ma ton tai du lieu o buoc truoc, clear het data trong buffer
        System.out.print("Please input your full name: ");
        String fullname = scanner.nextLine();
        System.out.println("Your fullname : " + fullname);
    }
}
