import java.util.Scanner;

public class LatihanJava03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Masukkan bilangan Celsius: ");
        int fahrenheit = input.nextInt();

        double celsius = (fahrenheit - 32) * (5 / 9);

        System.out.println("Nilai suhu Celsius adalah: " + celsius);

        input.close();
    }
}
