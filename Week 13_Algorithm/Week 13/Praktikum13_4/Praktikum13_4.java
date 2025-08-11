package Praktikum13_4;

import java.util.Scanner;

public class Praktikum13_4 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Input Angka 1 : ");
         int angk1 = scan.nextInt();
         System.out.println("Input angka 2 :");
         int angk2 = scan.nextInt();

         Besar bsr = new Besar();
         Kecil kcl = new Kecil();
         bsr.printMenu(angk1, angk2);
         kcl.printMenu(angk1, angk2);
    }

 
}