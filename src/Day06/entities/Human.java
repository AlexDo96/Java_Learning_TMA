package Day06.entities;


public class Human extends CHuman implements IHuman, ID {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Human(){
        super();
    }

    public Human(String name, String gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
    }

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat");
    }


    @Override
    public void b1() {
        System.out.println("B1");
    }

    @Override
    public void b2() {
        System.out.println("B2");
    }

    @Override
    public void c1() {
        System.out.println("C1");
    }

    @Override
    public void c2() {
        System.out.println("C2");
    }

    @Override
    public void d1() {

    }

    @Override
    public void d2() {

    }

    @Override
    public void CHuman1() {

    }

    @Override
    public void CHuman2() {

    }
}
