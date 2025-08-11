import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> deretAngka = new ArrayList<Integer>();

        // Meminta pengguna memasukkan banyak deret angka
        System.out.print("Masukkan banyak deret angka: ");
        int n = input.nextInt();

        // Memasukkan angka ke dalam ArrayList
        System.out.println("Masukkan angka 1-5:");
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            int angka = input.nextInt();
            if (angka >= 1 && angka <= 5) {
                deretAngka.add(angka);
            } else {
                System.out.println("Masukkan tidak valid. Masukkan angka 1-5.");
                i--;
            }
        }

        // Meminta angka yang dicari
        System.out.print("Masukkan angka yang dicari: ");
        int angkaDicari = input.nextInt();

        // Mencari index pertama dan terakhir angkaDicari
        int indexPertama = deretAngka.indexOf(angkaDicari);
        int indexTerakhir = deretAngka.lastIndexOf(angkaDicari);

        // Menampilkan hasil
        if (indexPertama != -1) {
            System.out.println("Angka " + angkaDicari + " pertama kali muncul di indeks: " + indexPertama);
            System.out.println("Angka " + angkaDicari + " terakhir kali muncul di indeks: " + indexTerakhir);
        } else {
            System.out.println("Angka " + angkaDicari + " tidak ditemukan dalam deret angka.");
        }

        input.close();
    }
}
