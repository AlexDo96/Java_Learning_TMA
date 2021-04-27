package Day02;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        String key;

        do {
            System.out.print("Menu: ");
            menu = scanner.nextInt();
            System.out.println("Menu is selected: " + menu);
            scanner.nextLine();
            System.out.println("Pres y(Y) to continue");
            key = scanner.nextLine();

        } while (key.equalsIgnoreCase("y"));

    }
}
