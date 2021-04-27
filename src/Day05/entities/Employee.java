package Day05.entities;

public class Employee extends Human {
    private String id;
    private double salary;

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employee (){

    }

    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, String gender, String id, double salary) {
        super(name, gender);
        this.id = id;
        this.salary = salary;
    }

    public void printEmployee(){
        super.print();
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
    }
}
