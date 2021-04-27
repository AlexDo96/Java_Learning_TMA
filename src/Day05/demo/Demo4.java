package Day05.demo;

import Day05.entities.Student;
/*
    Mang doi tuong
 */
public class Demo4 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Name 1", "male", "s01", 8.7);
        students[1] = new Student("Name 2", "female", "s02", 8.5);
        students[2] = new Student("Name 3", "male", "s03", 7.7);

        System.out.println("Student list ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName());
            System.out.println("Gender: " + students[i].getGender());
            System.out.println("ID: " + students[i].getId());
            System.out.println("Score: " + students[i].getScore());
        }

        System.out.println("Student list ");
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }

        System.out.println("\nStudent list 1");
        for (int i = 0; i < students.length; i++) {
            students[i].printStudent();
        }

        System.out.println("\nStudent list 2");
        for (Student student : students) {
            student.printStudent();
        }
    }
}
