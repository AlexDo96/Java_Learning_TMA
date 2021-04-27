package Day05.entities;

public class Rectangle extends Shape {
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

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(String name, Double a, Double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("Shape: Hinh chu nhat");
    }

    @Override
    public Double area() {
        return this.a * this.b;
    }

    @Override
    public Double perimeter() {
        return (this.a + this.b) * 2;
    }

    @Override
    public void printArea() {
        System.out.println("Area: " + this.area());
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter: " + this.perimeter());
    }

}
