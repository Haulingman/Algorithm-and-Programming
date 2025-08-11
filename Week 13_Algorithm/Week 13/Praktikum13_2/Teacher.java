package Praktikum13_2;

public class Teacher extends person {
     private String employeeID;

    public Teacher(String name, int age,String employeeID) {
        super(name, age);
        this.employeeID = employeeID;
    }

    public void teach(){
        System.out.println("Sedang mengajar sebagai seorang guru!");
    }
}
