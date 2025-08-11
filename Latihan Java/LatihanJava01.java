import java.util.Scanner;

public class LatihanJava01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Masukkan sebuah angka (henti dengan -1): ");
            number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Program berhenti.");
                break;
            }

            if (isEven(number)) {
                System.out.println(number + " adalah angka genap.");
            } else {
                System.out.println(number + " adalah angka ganjil.");
            }

            if (isMultipleOf5(number)) {
                System.out.println(number + " adalah kelipatan 5.");
            } else {
                System.out.println(number + " bukan kelipatan 5.");
            }
        } while (true);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah sebuah angka genap atau ganjil
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Fungsi untuk memeriksa apakah sebuah angka kelipatan 5 atau bukan
    public static boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    // Fungsi untuk mengonversi suhu dari Celsius ke Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
