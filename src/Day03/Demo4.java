package Day03;

public class Demo4 {
    public static void main(String[] args) {
        String[] names = {
                "Name 1", "Name 2", "Name 3", "Name 4"
        };

        System.out.print("Element 3: " + names[2]);
        System.out.print("\nSize: " + names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }

        /*
        Duyet mang ko can xac dinh do dai mang
         */
        System.out.println("\nfor:");
        for (String i : names) {
            System.out.print(i + " ");
        }
    }
}
