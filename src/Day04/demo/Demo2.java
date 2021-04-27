package Day04.demo;

import Day04.entities.*;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId("P01");
        product1.setName("Lifebouy");
        product1.setPrice((double) 250000);
        product1.setQuantity(20);
        product1.setStatus(true);
        Double TotalPrice1= product1.getPrice()*product1.getQuantity();

        Scanner scanner = new Scanner(System.in);
        Product product2 = new Product();
        System.out.print("Id: ");
        product2.setId(scanner.nextLine());
        System.out.print("Name: ");
        product2.setName(scanner.nextLine());
        System.out.print("Price: ");
        product2.setPrice(scanner.nextDouble());
        System.out.print("Quantity: ");
        product2.setQuantity(scanner.nextInt());
        System.out.print("Status: ");
        product2.setStatus(scanner.nextBoolean());
        Double TotalPrice2= product2.getPrice()*product2.getQuantity();


        System.out.println("ID san pham: " + product1.getId());
        System.out.println("Ten san pham: " + product1.getName());
        System.out.println("Gia san pham: " + product1.getPrice());
        System.out.println("So luong san pham: " + product1.getQuantity());
        System.out.println("Tong tien: " + TotalPrice1);
        System.out.println("San sang giao san pham ?: " + product1.isStatus());

        System.out.println("ID san pham: " + product2.getId());
        System.out.println("Ten san pham: " + product2.getName());
        System.out.println("Gia san pham: " + product2.getPrice());
        System.out.println("So luong san pham: " + product2.getQuantity());
        System.out.println("Tong tien: " + TotalPrice2);
        System.out.println("San sang giao san pham ?: " + product2.isStatus());


    }
}
