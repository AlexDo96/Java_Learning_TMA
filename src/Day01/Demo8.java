package Day01;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //cho phep user input data

        System.out.print("\nPlease input Toan : ");
        double toan = scanner.nextDouble();

        System.out.print("Please input Ly : ");
        double ly = scanner.nextDouble();

        System.out.print("Please input Hoa : ");
        double hoa = scanner.nextDouble();

        double average = (toan * 3 + ly * 2 + hoa) / 6;
        System.out.println("Average : " + average);

        if (average >= 8) {
            System.out.println("Your rank is Excellent");
        } else if (average >= 7) {
            System.out.println("Your rank is Good");
        } else if (average >= 6) {
            System.out.println("Your rank is Quite Good");
        } else if (average >= 5) {
            System.out.println("Your rank is Normal");
        } else {
            System.out.println("Your rank is Bad");
        }


        // ? => Conditions ? result 1 (condition is true) : result 2 (condition is false)


        System.out.print("\nPlease input Thu : ");
        int thu = scanner.nextInt();
        switch (thu) {
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Thu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;
            case 8:
                System.out.println("CN");
                break;
            default:
                System.out.println("Ko phu hop");
        }

    }
}
