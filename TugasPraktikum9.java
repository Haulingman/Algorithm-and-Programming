import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class TugasPraktikum9_JonathanChandra_00000094067 {
    public static void main(String[] args) {
        int banyakMakanan = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("=========== KANTINKU ===========");
        System.out.printf("Jumlah Makanan: ");
        banyakMakanan = input.nextInt();
        input.nextLine();
        System.out.println();
        ArrayList<Integer> listKodeMakanan = new ArrayList<Integer>();
        ArrayList<Integer> listJumlahPesanan = new ArrayList<Integer>();
        for (int i = 1; i <= banyakMakanan; i++) {
            System.out.printf("Makanan ke-%d\n", i);
            System.out.printf("Kode Makanan: ");
            int kodeMakanan = input.nextInt();
            input.nextLine();
            listKodeMakanan.add(kodeMakanan);
            System.out.printf("Jumlah Pesanan: ");
            int jumlahPesanan = input.nextInt();
            input.nextLine();
            listJumlahPesanan.add(jumlahPesanan);
            System.out.println();
        }

        ArrayList<String> listNamaMakanan = new ArrayList<String>();
        ArrayList<Integer> listHargaMakanan = new ArrayList<Integer>();
        ArrayList<Integer> listSubtotal = new ArrayList<Integer>();
        long total = 0;
        for (int i = 0; i < banyakMakanan; i++) {
            try {
                try (BufferedReader reader = new BufferedReader(new FileReader("menu.txt"))) {
                    try {
                        String line = reader.readLine();
                        while (line != null) {
                            if(String.format("Kode Makanan: " + listKodeMakanan.get(i)).equals(line)){
                                line = reader.readLine();
                                String namaMakanan = line.substring(14, line.length());
                                listNamaMakanan.add(namaMakanan);
                                line = reader.readLine();
                                int hargaMakanan = Integer.parseInt(line.substring(15, line.length()));
                                listHargaMakanan.add(hargaMakanan);
                                int subtotal = hargaMakanan * listJumlahPesanan.get(i);
                                listSubtotal.add(subtotal);
                                total += subtotal;
                                System.out.println(namaMakanan);
                                System.out.println(hargaMakanan);
                                System.out.println(subtotal);
                            } else {
                                line = reader.readLine();
                            }    
                        }
                    } catch (IOException e) {
                        System.err.println("Terjadi kesalahan saat membaca file");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                System.out.println("terjadi kealahan saat membuka file");
            }
        }
        System.out.println(total);

    try {
        BufferedWriter receiptWriter = new BufferedWriter(new FileWriter("receipt.txt"));
        receiptWriter.write("===============================================================================\n");
            receiptWriter.write("                                    STRUK PEMBELIAN           \n");
            receiptWriter.write("===============================================================================\n");
            receiptWriter.write(String.format("%-4s %-20s %-8s %-20s %-15s\n", "No", "Nama Makanan", "Jumlah", "Harga per Makanan", "SubTotal"));
            receiptWriter.write("===============================================================================\n");
            for (int i = 1; i <= banyakMakanan; i++) {
                receiptWriter.write(String.format("%-4d %-20s %-8d %-20d %-15d\n", i, listNamaMakanan.get(i-1), listJumlahPesanan.get(i-1), listHargaMakanan.get(i-1), listSubtotal.get(i-1)));
            }
            receiptWriter.write("===============================================================================\n");
            receiptWriter.write(String.format("%-53s %d\n", "Total:", total));
             receiptWriter.write("===============================================================================\n");// Menukar posisi subtotal dengan total
            receiptWriter.write("Kasir: Jonathan Chandra            |           NIM: 00000094067\n");
            receiptWriter.close();
    } catch (IOException e) {

    }
    }
}
