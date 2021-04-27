package Day04.entities;

public class Student {
    private String id;
    protected String name;
    public String address;
    private int age;


    /*
    Tinh bao dong: Khong duoc truy cap truc tiep vao thuoc tinh cua doi tuong
    Phai qua getter, setter de validate data
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18||age>120){
            System.out.println("Invalid");
        }else{
            this.age = age;
        }
    }


}
