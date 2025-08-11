import java.util.Scanner;

public class Praktikum6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan nilai: ");
        int nilai = scan.nextInt();

        for (int i = 1; i <= nilai; i++) {
            System.out.printf("\nNilai ke-%d = %d", i, i);
        }
        scan.close();
    }
}