import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ContohBufferedReader {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));  // Membuat objek Scanner
        System.out.println("Memasukkan integer:");
        int num = Integer.parseInt(input.readLine());  // Membaca integer
        System.out.println("Memasukkan String");
        String str = input.readLine(); // Membaca string
        System.out.println("Anda Memasukkan: " + num + " dan " + str);
        input.close(); // menutup Scanner
    }
}
