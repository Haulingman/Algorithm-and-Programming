/**
 * Contoh Studi Kasus Exception Handling & File
 */
import java.io.*;
import java.util.Scanner;

public class Contoh_Studi_Kasus_Exception_Handling_File {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
      String operation;

      System.out.println("Selamat datang di FileManager");
      while (true) {
        System.out.println("Pilih operasi (baca/tulis/keluar): ");
        operation = scanner.nextLine().trim().toLowerCase();

        if (operation.equals("keluar")) {
            System.out.println("Terima kasih telah menggunakan FileManager. Sampai jumpa!");
            break;
        }

        switch (operation) {
            case "baca":
                readFile();
                break;
            case "tulis":
                System.out.println("Masukan teks yang akan disimpan: ");
                String text = scanner.nextLine();
                writeFile(text);
                break;
            default:
            System.out.println("Operasi tidak dikendali. Silahkan pilih 'baca' atau 'tulis'.");
            scanner.close();
        }
      }
    }

    private static void writeFile(String text) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write(text);
            writer.newLine();
            System.out.println("Teks berhasil disimpan di file.");
        } catch (IOException e) {
            System.out.println("Error saat menulis ke file.");
        } finally {
            try {
                if (writer !=null) writer.close();
            } catch (IOException e) {
                System.out.println("Error saat menutup file.");
            }
        }
    }
        

    private static void readFile() {
        File file = new File ("output.txt");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Isi file");
            while ((line = reader.readLine()) != null); 
        } catch (FileNotFoundException e){
        System.out.println("Error: File tidak ditemukan.");
    } catch(IOException e) {
        System.out.println("Error saat membaca file.");
    } finally {
        try {
            if (reader != null) reader.close();
        } catch (IOException e) {
            System.out.println("Error saat menutup file.");
        }
    }
}
}