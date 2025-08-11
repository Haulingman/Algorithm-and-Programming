import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TugasPraktikum11_JonathanChandra_00000094067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> pilihan = new ArrayList<>();

        try {
            File folder = new File("E:\\Jonithan\\Week 11\\menu.txt");
            Scanner A = new Scanner(folder);
            while (A.hasNextLine()) {
                String garis = A.nextLine();
                String[] angka = garis.split(",");
                if (angka.length >= 3) {
                    pilihan.add(angka);
                } else {
                    System.out.println("Format data tidak valid pada baris " + garis);
                }
            }

            A.close();
        } catch (FileNotFoundException e) {
            System.err.println("File tidak tersedia.");
            return;
        }

        System.out.print("Masukan Pesanan anda : ");
        int totalmakanan = scan.nextInt();

        int harga = 0;
        ArrayList<String[]> makanan = new ArrayList<>();
        for (int i = 1; i <= totalmakanan; i++) {
            System.out.printf("\nMakanan Ke-%d\n", i);
            System.out.print("Kode Makanan  : ");
            String kode = scan.next();
            System.out.print("Jumlah : ");
            int pilih = scan.nextInt();
            String[] poin = null;
            for (String[] menuitems : pilihan) {
                if (menuitems[0].equals(kode)) {
                    poin = menuitems;
                    break;
                }
            }
            if (poin == null) {
                System.out.println("Kode makanan tidak valid.");
                continue;
            }

            int subtotal = Integer.parseInt(poin[2]) * pilih;
            harga += subtotal;

            String[] pesananmakanan = {poin[0], poin[1], poin[2], Integer.toString(subtotal)};
            makanan.add(pesananmakanan);
        }

        try {
            PrintWriter writer = new PrintWriter("struk.txt");
            writer.println("\t \t \t \t \t K A N T I N K U \t\t\t\t\t");
            writer.println("-----------------------------------------------------------");
            writer.println("No |    Makanan    | Jumlah |     Harga    | Subtotal");
            writer.println("===========================================================");
            int nomor = 1;
            for (String[] poin : makanan) {
                writer.printf("%d  | %-13s | %-7s| Rp. %-8s | Rp. %-9s\n", nomor, poin[1], poin[0], poin[2], poin[3]);
                nomor++;
            }
            writer.println("-----------------------------------------------------------");
            writer.printf("Total :                                      Rp. %-9d\n", harga);
            writer.println("===========================================================");
            writer.println("Kasir : Jonathan Chandra     |        NIM: 00000094067");
            writer.close();
            System.out.println("\n----------------------------------");
            System.out.println("Berhasil Mencetak Struk!");
        } catch (FileNotFoundException e) {
            System.out.println("Gagal mencetak struk transaksi");
        }
    }
}


