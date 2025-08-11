package Praktikum13_1;
import java.util.Scanner;

public class Praktikum13_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tpesan pesan = new Tpesan();
        System.out.print("Input Pesan : ");
        String input = scan.nextLine();
        System.out.print(pesan.tampilkanPesan(input));
    }



}
