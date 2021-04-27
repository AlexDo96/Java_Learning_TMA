package Day03;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String s = "Hello World";
        int len = s.length();
        System.out.println("len: " + len);

        char ch = s.charAt(1);
        System.out.println("ch: " + ch);

        //Duyet chuoi
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        String s2 = "abc";
        System.out.println("empty:  " + s2.isEmpty());

        String s3 = "";
        System.out.println("empty:  " + s3.isEmpty());

        String s4 = "     abc      ";
        System.out.println("empty:  " + s4.length());

        String s5 = "     abc      ";
        System.out.println("empty:  " + s5.trim().length());

        String name1 = "kevin";
        name1 = name1.toUpperCase();
        System.out.println("name1: " + name1);

        String name2 = "KEVIN";
        name2 = name2.toLowerCase();
        System.out.println("name2: " + name2);

        System.out.println("equals: " + name1.equals(name2));
        System.out.println("equals: " + name1.equalsIgnoreCase(name2));  //Ko phan biet hoa thuong

        String name3 = "KEVIN";
        String keyword1 = "ke";
        String keyword2 = "in";
        String keyword3 = "vi";

        System.out.println("startsWith: " + name3.toLowerCase().startsWith(keyword1.toLowerCase()));
        System.out.println("endsWith: " + name3.toLowerCase().endsWith(keyword2.toLowerCase()));
        System.out.println("contains: " + name3.toLowerCase().contains(keyword3.toLowerCase()));


        /*
        Yeu cau nguoi su dung nhap vao username va password.
        Kiem tra username = abc, password = 123 => Passed
        Nguoc lai, Failed
         */
        Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.println("Nhap username: ");
        username = scanner.nextLine();

        System.out.println("Nhap password: ");
        password = scanner.nextLine();

        if (username.equals("abc") && password.equals("123")) {
            System.out.println("Login passed");
        } else {
            System.out.println("Login failed");
        }

        /*
        Cat chuoi vao mang (Array)
         */
        String line = "p01,name 1,4.5,7";
        String[] result= line.split(",");
        System.out.print("Result 1: " +result[0]);
        System.out.print("Result 2: " +result[1]);
        System.out.print("Result 3: " +result[2]);



    }
}
