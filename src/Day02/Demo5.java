package Day02;

import java.util.Scanner;

public class Demo5 {
    //Yeu cau user nhap diem Toan kieu so thuc
    //Neu diem Toan < 0 hoac > 10 thi yeu cau nhap lai
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double m;

        do{
            System.out.print("Nhap diem Toan: ");
            m = scanner.nextDouble();
        }while (m < 0 || m > 10);

        System.out.println("Diem Toan ko hop le, nhap lai diem Toan: ");
    }
}
