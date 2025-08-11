package Praktikum13_5;

import java.util.Scanner;

public class Praktikum13_5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======Kalkulator Sederhana ========");
        System.out.println("Masukkan bilangan pertama : ");
        double bil1 = scanner.nextDouble();
        System.out.println("Masukkan bilangan kedua : ");
        double bil2 = scanner.nextDouble();
        boolean exit = false;

        while (!exit) {
            System.out.println("Pilih operasi aritmatika sederhana :");
            System.out.println("1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.Quit");
            int operasi = scanner.nextInt();

            switch (operasi) {
                case 1:
                    System.out.println("Penjumlahan dari " + bil1 + " dan " + bil2 + " adalah " + (bil1 + bil2) + ".");
                    break;
                case 2:
                    System.out.println("Pengurangan dari " + bil1 + " dan " + bil2 + " adalah " + (bil1 - bil2) + ".");
                    break;
                case 3:
                    System.out.println("Perkalian dari " + bil1 + " dan " + bil2 + " adalah " + (bil1 * bil2) + ".");
                    break;
                case 4:
                    System.out.println("Pembagian dari " + bil1 + " dan " + bil2 + " adalah " + (bil1 / bil2) + ".");
                    break;
                case 5:
                    System.out.println("Program telah berhenti");
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }
}
