import java.util.Scanner;

public class Zodiak {
    public static void main(String[] args) {
        // membuat objek Scanner untuk membaca input dari user
        Scanner input = new Scanner(System.in);

        // meminta user untuk memasukkan tanggal dan bulan kelahirannya
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();

        // menentukan zodiak user berdasarkan tanggal dan bulan kelahirannya
        if ((tanggal >= 21 && bulan == 3) || (tanggal <= 19 && bulan == 4)) {
            System.out.println("Zodiak Anda adalah Aries");
        } else if ((tanggal >= 20 && bulan == 4) || (tanggal <= 20 && bulan == 5)) {
            System.out.println("Zodiak Anda adalah Taurus");
        } else if ((tanggal >= 21 && bulan == 5) || (tanggal <= 20 && bulan == 6)) {
            System.out.println("Zodiak Anda adalah Gemini");
        } else if ((tanggal >= 21 && bulan == 6) || (tanggal <= 22 && bulan == 7)) {
            System.out.println("Zodiak Anda adalah Cancer");
        } else if ((tanggal >= 23 && bulan == 7) || (tanggal <= 22 && bulan == 8)) {
            System.out.println("Zodiak Anda adalah Leo");
        } else if ((tanggal >= 23 && bulan == 8) || (tanggal <= 22 && bulan == 9)) {
            System.out.println("Zodiak Anda adalah Virgo");
        } else if ((tanggal >= 23 && bulan == 9) || (tanggal <= 22 && bulan == 10)) {
            System.out.println("Zodiak Anda adalah Libra");
        } else if ((tanggal >= 23 && bulan == 10) || (tanggal <= 21 && bulan == 11)) {
            System.out.println("Zodiak Anda adalah Scorpio");
        } else if ((tanggal >= 22 && bulan == 11) || (tanggal <= 21 && bulan == 12)) {
            System.out.println("Zodiak Anda adalah Sagitarius");
        } else if ((tanggal >= 22 && bulan == 12) || (tanggal <= 19 && bulan == 1)) {
            System.out.println("Zodiak Anda adalah Capricorn");
        } else if ((tanggal >= 20 && bulan == 1) || (tanggal <= 18 && bulan == 2)) {
            System.out.println("Zodiak Anda adalah Aquarius");
        } else if ((tanggal >= 19 && bulan == 2) || (tanggal <= 20 && bulan == 3)) {
            System.out.println("Zodiak Anda adalah Pisces");
        } else {
            System.out.println("Input Anda tidak valid");
        }

        // menutup objek Scanner
        input.close();
    }
}
