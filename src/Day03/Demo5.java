package Day03;

public class Demo5 {
    public static void main(String[] args) {
        int[] a = {5, 10, -3, 9, 11, -8};

        print(a);

        System.out.println("\nTotal: " + total(a));
        System.out.println("Count <0: " + count(a));
        System.out.println("Min: " + min(a));
        System.out.println("Max: " + max(a));
        System.out.println("Is Exist: " + exist(a, 5));
        print(sort(a));
    }

    public static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    /*
    1. Tinh tong
    2. Dem
    3. Min, Max
    4. Kiem tra co ton tai
     */

    public static int total(int[] a) {
        int s = 0;

        for (int i : a) {
            s += i;
        }
        return s;
    }

    public static int count(int[] a) {
        int counter = a.length;

        for (int i : a) {
            if (i < 0)
                counter++;
        }

        return counter;
    }

    public static int min(int[] a) {
        int min = a[0];

        for (int i : a) {
            if (i < min)
                min = i;
        }
        return min;
    }

    public static int max(int[] a) {
        int max = a[0];

        for (int i : a) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static boolean exist(int[] a, int input) {
        for (int i : a) {
            if (input == i)
                return true;
        }
        return false;
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
