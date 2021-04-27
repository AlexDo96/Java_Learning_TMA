package Day06.demo;

public class Demo2 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace(); //Track lai cho nao bi exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
