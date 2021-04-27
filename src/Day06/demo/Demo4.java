package Day06.demo;

public class Demo4 {
    private static void Hello() throws Exception { //Bat buoc thuc hien phai co try/catch exception
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        try {
            Hello();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
