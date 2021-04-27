package Day04.entities;

public class Product {
    private String id;
    private String name;
    private Double price;
    private int quantity;
    private boolean status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /*
    Contructor: Ham khoi tao
    Pham vi truy xuat luon la public
    Phai trung ten class
    Ko khai bao kieu du lieu
    Trong 1 class co the co nhieu Contructor, phan biet thong qua so luong tham so va kieu du lieu cua tham so
     */

    public Product() { //Contructor ko tham so
        System.out.println("Constructor ko tham so");
    }

    public Product(String id) {
        this.id = id;
    }

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String id, String name, Double price, int quantity, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.status = status;

        System.out.println("Constructor day du tham so");
    }

    public void add() {
        System.out.println("Add Product");
    }

    public void update(double price, int quantity) {
        System.out.println("Update Product");
    }

    public double total() {
        return this.price * this.quantity;
    }

    public void print() {
        System.out.println("ID san pham: " + this.id);
        System.out.println("Ten san pham: " + this.name);
        System.out.println("Gia san pham: " + this.price);
        System.out.println("So luong san pham: " + this.quantity);
        System.out.println("San sang giao san pham ?: " + this.status);
    }

    public Product insert1() {
        Product product = new Product();
        product.setId("P01");
        product.setName("Lifebouy");
        product.setPrice((double) 250000);
        product.setQuantity(20);
        product.setStatus(true);
        return product;
    }

    public Product insert2() {
        Product product = new Product("p04", "Colgate", (double) 30000, 8, true);
        return product;
    }

    public void insert3(Product product) {
        System.out.println("ID san pham: " + product.getId());
        System.out.println("Ten san pham: " + product.getName());
        System.out.println("Gia san pham: " + product.getPrice());
        System.out.println("So luong san pham: " + product.getQuantity());
        System.out.println("San sang giao san pham ?: " + product.isStatus());
    }
}
