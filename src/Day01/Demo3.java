package Day01;

public class Demo3 {
    public static void main(String[] args) {
        int a = 10, b = 4;
        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;

        int result4 = a / b;
        int result5 = a % b;

        double result6 = (double) a / b;

        System.out.println("\nKet qua a + b = " + result1);
        System.out.println("Ket qua a - b = " + result2);
        System.out.println("Ket qua a * b = " + result3);
        System.out.println("Ket qua a / b = " + result4);
        System.out.println("Ket qua a / b lay phan du = " + result5);
        System.out.println("Ket qua a / b so thap phan = " + result6);

        a++;
        System.out.println("Tang gia tri a = " + a);
        b--;
        System.out.println("Giam gia tri b = " + b);

        a+=5;
        System.out.println("Tang 5 gia tri cho a = " + a);
        b-=5;
        System.out.println("Giam 5 gia tri cho b = " + b);



    }
}
