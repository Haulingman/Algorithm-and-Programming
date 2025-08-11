package Praktikum13_2;

import java.util.Scanner;

public class Praktikum13_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih data yang ingin ditampilkan : ");
        System.out.println("1.Siswa");
        System.out.println("2.Guru");
        System.out.print("Pilihan : ");
        int Pilihan = scan.nextInt();
        if (Pilihan == 1) {
            System.out.println("Masukkan Data Siswa : ");
            System.out.print("Nama : ");
            String studentname = scan.next();
            System.out.print("Usia : ");
            int studentAge = scan.nextInt();
            System.out.print("ID siswa : ");
            String studentID = scan.next();
            student student = new student(studentname,studentAge,studentID);
            System.out.println("\nInformasi siswa");
            student.displayInfo();
            student.study();
        }else{
             System.out.println("Masukkan Data Guru  : ");
            System.out.print("Nama : ");
            String teachername = scan.next();
            System.out.print("Usia : ");
            int teacherAge = scan.nextInt();
            System.out.print("ID siswa : ");
            String teacherID = scan.next();

            Teacher teacher = new Teacher(teachername, teacherAge,teacherID);
            System.out.println("\ninformasi guru:");
            teacher.displayInfo();
            teacher.teach();
        }
    }
}