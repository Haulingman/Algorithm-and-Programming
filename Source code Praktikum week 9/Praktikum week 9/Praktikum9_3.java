import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Praktikum9_3 {
    static FileWriter writer;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Kalimat: ");
        String kalimat = scan.nextLine();
        bukaFile();
        tulisKeFile (kalimat);
        tutupFile();
    }
    private static void tutupFile() {
    }
    private static void tulisKeFile(String kalimat) {
    }
    private static void bukaFile() {
        try {
            writer = new FileWriter("Prak9.txt");
        }catch (IOException e) {
            System.err.println();
        }
    }
}
