import java.util.Scanner;

public class Praktikum4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat datang di Sistem Pengecekan Kata Palindrom!");

        System.out.println("Silahkan masukkan sebuah kata: ");
        String kata = input.nextLine();

        if (isPalindrome(kata)) {
            System.out.println("Kata \"" + kata + "\" adalah kata Palindrom.");
        } else {
            System.out.println("Kata \"" + kata + "\" bukan kata Palindrom.");
        }
        input.close();
    }

    public static boolean isPalindrome(String kata) {
         kata = kata.replaceAll("\\s", ""). toLowerCase(); 

        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
