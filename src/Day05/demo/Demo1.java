package Day05.demo;

import Day05.entities.*;


public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Name 1");
        student1.setGender("male");
        student1.setId("s01");
        student1.setScore(8.5);

        System.out.println("Student 1 info");
        System.out.println("Name: " + student1.getName());
        System.out.println("Gender: " + student1.getGender());
        System.out.println("ID: " + student1.getId());
        System.out.println("Score: " + student1.getScore());

        Employee employee1 = new Employee();
        employee1.setName("Name 1");
        employee1.setGender("male");
        employee1.setId("Name 1");
        employee1.setSalary(5000000);

        System.out.println("Employee 1 info");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Gender: " + employee1.getGender());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Salary: " + employee1.getSalary());
    }
}
