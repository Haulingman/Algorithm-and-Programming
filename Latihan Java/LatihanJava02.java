import java.util.*;
public class LatihanJava02 {
    public static void main(String[] args) {
            try (ContohScanner scanner = new ContohScanner(System.in)) {
                int number;
                do {
                    System.out.printf("Masukkan sebuah angka: ");
                    number = scanner.nextInt(); scanner.nextLine();
                    if (number == 0) {
                        System.out.println("Program berhenti. ");
                        break;
                    }
                    if (number > 0) {
                        System.out.println("Angka positif.");
                    } else if (number < 0) {
                        System.out.println("Angka negatif.");
                    } else {
                        System.out.println("Angka nol.");
                    }
                    if (isSatuan(number)) {
                        System.out.println(number +" number angka satuan.");
                    } else if (isPuluhan(number)) {
                        System.out.println(number +" number angka puluhan.");
                    } else if (isRatusan(number)) {
                        System.out.println(number +" number angka ratusan.");
                    } else if (isRibuan(number)) {
                        System.out.println(number +" number angka ribuan");
                    }
                } while (true);

                System.out.printf("Masukkan bilangan Farenheit: ");
                int fahrenheit = scanner.nextInt(); scanner.nextLine();
                
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Nilai suhu Celsius adalah: " + celsius);
            } 
    }

    private static boolean isSatuan(int number) {
        return number >= 0 && number <= 9 ;
    }

    private static boolean isPuluhan(int number) {
        return number >= 10 && number <= 99;
    }

    private static boolean isRatusan(int number) {
        return number >= 100 && number <= 999;
    }

    private static boolean isRibuan(int number) {
        return number >= 1000 && number <= 9999;
    }
}
