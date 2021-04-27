package Day05.demo;

import Day05.entities.Student;

/*
   Khai bao mang doi tuong 2
 */
public class Demo5 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Name 1", "male", "s01", 8.7),
                new Student("Name 2", "female", "s02", 8.5),
                new Student("Name 3", "male", "s03", 7.7)
        };

        System.out.println("Student list");
        for (Student student : students) {
            student.printStudent();
        }

    }
}
