import java.util.Scanner;
import java.util.Arrays;

public class Praktikum4_2 {
    private static final boolean Arra = false;

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat datang dalam sistem pengecekkan Anagram!");
        System.out.println("Silahkan masukkan kata pertama: ");
        String kata1 = input.nextLine();
        System.out.println("Silahkan masukkan kata kedua: ");
        String kata2 = input.nextLine();
        if (isAnagram(kata1, kata2)) {
            System.out.println("Kata \"" + kata1 + "\" dan \"" + kata2 + "\" adalah anagram.");
        } else {
            System.out.println("Kata \"" + kata1 + "\" dan \"" + kata2 + "\" bukan anagram.");
        }
        input.close();
    }

    private static boolean isAnagram(String kata1, String kata2) {
        kata1 = kata1.replaceAll("\\s", "").toLowerCase();
        kata2 = kata2.replaceAll("\\s", "").toLowerCase();
        char [] arrkata1 = kata1.toCharArray();
        char [] arrkata2 = kata2.toCharArray();
        return Arrays.equals(arrkata1, arrkata2);
    }
}
