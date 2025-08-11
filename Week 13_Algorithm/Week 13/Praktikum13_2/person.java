package Praktikum13_2;
public class person {
    protected String name;
    protected int age;

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

public void displayInfo(){
    System.out.println("Nama : " + name);
    System.out.println("Usia : " + age);

 }
}

