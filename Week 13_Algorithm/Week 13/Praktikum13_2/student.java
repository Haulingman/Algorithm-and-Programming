package Praktikum13_2;

public class student extends person {
    private String studentID;

    public student(String name, int age ,String studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    
	public void study(){
        System.out.println("sedang belajar sebgai seorang siswa.");
    }
}

