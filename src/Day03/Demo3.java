package Day03;

public class Demo3 {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 10;
        a[1] = -4;
        a[2] = 9;
        a[3] = 2;
        a[4] = -28;

        System.out.print("Element 1: " + a[1]);
        System.out.print("Size: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        /*
        Duyet mang ko can xac dinh do dai mang
         */
        System.out.println("\nfor:");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
