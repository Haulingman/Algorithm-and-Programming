import java.io.File;
import java.util.Scanner;

public class Praktikum9_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan alamat atau directory file: ");
        String directory = scan.nextLine();
        File file = new File(directory);
        if (file.exists()) {
            System.out.printf("%s %s\n", file.getName(), " Ada");
            System.out.println("Path absolut: " + file.getAbsolutePath());
            if (file.isFile()) {
                System.out.printf("%s %s\n", file.getName(), " Adalah File");
            } else {
                System.out.printf("%s %s\n", file.getName(), " Bukan File");
            }

            if (file.isDirectory()) {
                System.out.printf("%s %s\n", file.getName(), " Adalah Direktori");
                String[] arrDir = file.list();
                System.out.println("Isi Folder: ");
                for (String isi : arrDir) {
                    System.out.println("\t" + isi);
                }
            } else {
                System.out.printf("%s %s\n", file.getName(), " Bukan Direktori");
            }

            System.out.printf("Apakah kamu ingin menghapus direktori/file ini? (Y/N)");
            String delete = scan.next();
            if (delete.equalsIgnoreCase("y")) {
                if (file.delete()) {
                    System.out.println("File/Direktori Berhasil di Hapus");
                } else {
                    System.out.println("File/Direktori Gagal di Hapus! ");
                    System.out.println("Jika direktori pastikan direktori tersebut kosong! ");
                    System.out.println("Jika file pastikan file tersebut tidak dibuka! ");
                }
            } else
                System.out.println("Terima Kasih! <3");
        } else {
            System.out.printf("%s %s\n", file.getName(), " Tidak ada");
        }
    }
}
