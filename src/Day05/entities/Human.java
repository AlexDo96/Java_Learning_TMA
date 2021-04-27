package Day05.entities;

/*
   Từ khóa super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất.
   Bất cứ khi nào bạn tạo ra instance(thể hiển) của lớp con, một instance của lớp cha được tạo ra ngầm định, nghĩa là được tham chiếu bởi biến super.

   Có 3 cách sử dụng như sau:
   + Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
   + super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
   + Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha
 */
public class Human {
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
}
