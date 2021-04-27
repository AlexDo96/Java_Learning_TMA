package Day05.demo;

import Day05.entities.Employee;
import Day05.entities.Student;

public class Demo2 {
    public static void main(String[] args) {
        Student student2 = new Student("Name 2","male","s02",8.7);

        System.out.println("Student 2 info");
        System.out.println("Name: " + student2.getName());
        System.out.println("Gender: " + student2.getGender());
        System.out.println("ID: " + student2.getId());
        System.out.println("Score: " + student2.getScore());

        Employee employee2 = new Employee("Name 2","female","s02",4000000);

        System.out.println("Employee 2 info");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Gender: " + employee2.getGender());
        System.out.println("ID: " + employee2.getId());
        System.out.println("Score: " + employee2.getSalary());

        System.out.println("Student 2 info");
        student2.printStudent();
        System.out.println("Employee 2 info");
        employee2.printEmployee();

    }
}
