package Praktikum13_3;

import java.util.Scanner;

public class Praktikum13_3 {
     public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nama: ");
    String inputline = scan.nextLine();

    orang orang = new orang(inputline);

    System.out.println("Nama awal: " + orang.getName());

    System.out.print("Masukkan nama baru: ");
    String newingutName = scan.nextLine();

    orang.setName(newingutName);

    System.out.println("Nama setelah diubah: " + orang.getName());
 }
}