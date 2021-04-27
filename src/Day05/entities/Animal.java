package Day05.entities;

/*
    Abstract class:
    + ko duoc tao doi tuong the hien tu abstract class, phai tao doi tuong thong qua class ke thua tu abstract class
    + khi khai bao 1 abstract class thi moi co the tao duoc nhung ham abstract
    + khi 1 class ke thua tu abstract class, bat buoc phai dinh nghia tat ca cac ham abstract trong abstract class
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){
        super();
    }

    public Animal(String name) {
        super();
        this.name = name;
    }

    public void print(){
        System.out.println("Name: " + this.name);
    }

    public abstract void sound();

}
