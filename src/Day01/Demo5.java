package Day01;

public class Demo5 {
    public static void main(String[] args) {
        int a = 10, b = 4;

        //and
        boolean result1 = a > 5 && b > 3;
        System.out.println("\na > 5 va b > 3 hay khong ? " + result1);

        //or
        boolean result2 = a > 5 || b > 3;
        System.out.println("a > 5 hoac b > 3 hay khong ? " + result2);

        //not
        boolean result3 = !result2;
        System.out.println("Phu dinh result 2 ? " + result3);

    }
}
