import java.io.File;
import java.io.IOException;

public class Praktikum9_1 {

    public static void main(String[] args) {
        File file = new File("iniFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File berhasil dibuat.");
            } else {
                System.out.println("File sudah ada.");
            }
            System.out.println("-----------------------------------------");
            System.out.println("BUILD SUCCESS");
            System.out.println("-----------------------------------------");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membuat file");
            System.exit(1);
        }
    }
}