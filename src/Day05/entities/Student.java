package Day05.entities;

/*
   extends:
   + class ke thua class
   + interface ke thua interface
   implements:
   + class ke thua interface

   class chi ke thua 1:1
   class ke thua inteface 1:n
   interface ke thua inteface 1:n

 */
public class Student extends Human {
    private String id;
    private double score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student (){

    }

    public Student(String id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, String gender, String id, double score) {
        super(name, gender);  //truy xuat tu con va cha
        this.id = id;
        this.score = score;
    }

    public void printStudent(){
        super.print();
        System.out.println("ID: " + this.id);
        System.out.println("Score: " + this.score);
    }

}
