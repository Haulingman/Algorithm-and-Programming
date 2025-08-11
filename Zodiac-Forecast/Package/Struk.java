package Package;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;

public class Struk {

    public static void writeToFile(String name, Zodiak zodiak) {
        try {
            FileWriter writer = new FileWriter("Zodiac.txt", true);
            writer.write("Nama     : " + name + "\n");
            writer.write("Zodiak   : " + zodiak.getNama() + "\n");
            writer.write("Periode  : " + zodiak.getPeriode() + "\n");
            writer.write("Karakter : " + zodiak.getKarakter() + "\n");
            writer.write("Elemen   : " + zodiak.getElemen() + "\n");
            writer.write("Bentuk   : " + zodiak.getHewan() + "\n");
            writer.write("==============================\n");
            writer.close();
            System.out.println("Informasi Zodiak Anda berhasil ditulis ke dalam file");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menulis file");
        }
    }

    public static void writeToFile(String fileName, ArrayList<String> data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String line : data) {
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("Data berhasil ditulis ke dalam file");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menulis file");
        }
    }

    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca file!");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Terjadi kesalahan saat menutup file!");
            }
        }

        return lines;
    }

    public static void deleteFile(String fileName) {
        try {
            File inputFile = new File(fileName);
            FileWriter writer = new FileWriter(inputFile);
            writer.write(""); // Menghapus semua isi file dengan menulis string kosong
            writer.close();
            System.out.println("Data berhasil dihapus");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menghapus entri dari file!");
        }
    }
}
