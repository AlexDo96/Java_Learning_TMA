package Day05.entities;

/*
    Abstract class:
    + ko duoc tao doi tuong the hien tu abstract class, phai tao doi tuong thong qua class ke thua tu abstract class
    + khi khai bao 1 abstract class thi moi co the tao duoc nhung ham abstract
    + khi 1 class ke thua tu abstract class, bat buoc phai dinh nghia tat ca cac ham abstract trong abstract class
 */
public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(){
        super();
    }

    public Shape(String name) {
        super();
        this.name = name;
    }

    public abstract void print();


    public abstract Double area();
    public abstract Double perimeter();

    public abstract void printArea();
    public abstract void printPerimeter();
}
