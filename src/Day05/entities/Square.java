package Day05.entities;

public class Square extends Shape {
    private Double a;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Square(Double a) {
        this.a = a;
    }

    public Square(String name, Double a) {
        super(name);
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Shape: Hinh vuong");
    }

    @Override
    public Double area() {
        return this.a * this.a;
    }

    @Override
    public Double perimeter() {
        return this.a * 4;
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
