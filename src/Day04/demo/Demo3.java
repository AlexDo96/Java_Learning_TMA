package Day04.demo;

import Day04.entities.Product;

public class Demo3 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("p01");
        Product product3 = new Product("P/S", (double) 50000, 5);
        Product product4 = new Product("p04", "Colgate", (double) 30000, 8,true);


        System.out.println("ID san pham: " + product4.getId());
        System.out.println("Ten san pham: " + product4.getName());
        System.out.println("Gia san pham: " + product4.getPrice());
        System.out.println("So luong san pham: " + product4.getQuantity());
        System.out.println("San sang giao san pham ?: " + product4.isStatus());

        product4.add();
        product4.update(35000,10);
        System.out.println("Thanh tien: " + product4.total());

    }
}
