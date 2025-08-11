import java.util.*;
public class Praktikum8_1 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in); 
         printmenu();
            double pilihan = scan.nextDouble();
            System.out.println("Input angka1: ");
            double angka1 = scan.nextInt(); 
            System.out.println("Input angka2: ");
            double angka2 = scan.nextInt();
            if(pilihan == 3) {
                System.out.println("Hasil adalah: "+ penjumlahan(angka1, angka2));
            } else {
                System.out.println("Untuk saat ini, operasi aritmatika yang dipilih belum tersedia");
            }
         
    }
    public static void printmenu() {
        System.out.println("===Aplikasi Operasi Aritmatika===");
        System.out.println("Silahkan pilih operator aritmatika apa yang ingin dijalankan");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pemabagian (/)");
        System.out.println("Pilihan: ");
    }
    private static double penjumlahan(double angka1, double angka2) {
        double total = angka1 + angka2; 
        return total;
    }

    
}