import java.util.*;
public class Praktikum8_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka = input.nextInt();

        System.out.println("Hasilnya " + faktorial(angka));
    }

    public static int faktorial(int angka) {
        int total = 1;
        for(int i = 1; i <= angka; i++) {
            total *= i;
        }
        return total;
    }
}
