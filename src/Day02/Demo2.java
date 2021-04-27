package Day02;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        int counter = 0;
        int counter2 = 0;
        int s = 0;

        for (int i = m; i <= n; i++) {
            System.out.print(i + " ");
            counter++;
            if (i % 2 == 0) {
                counter2++;
            }

            //Sum all
            s = s + i;
        }

        System.out.println("\nCounter: " + counter);
        System.out.println("Counter2: " + counter2);
        System.out.println("s: " + s);
    }
}
