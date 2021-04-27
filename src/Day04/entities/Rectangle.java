package Day04.entities;

public class Rectangle {
    private Double a;
    private Double b;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Rectangle() {
    }

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public void insert(Rectangle rectangle) {
        System.out.println("Chieu dai: " + rectangle.getA());
        System.out.println("Chieu rong: " + rectangle.getB());
    }

    public void print() {
        System.out.println("Chieu dai: " + this.a);
        System.out.println("Chieu rong: " + this.b);
        System.out.println("Dien tich HCN: " + DientichHCN());
        System.out.println("Chu vi HCN: " + ChuviHCN());
    }

    public Double DientichHCN() {
        return this.a * this.b;
    }

    public Double ChuviHCN() {
        return (this.a + this.b) * 2;
    }


}
