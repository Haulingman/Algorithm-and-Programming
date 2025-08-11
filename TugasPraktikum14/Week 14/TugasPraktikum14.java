import java.util.Scanner;

public class TugasPraktikum14_Jonathanchandra_00000094067{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahMahasiswa;

        System.out.print("Banyaknya mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();

        String[] nama = new String[jumlahMahasiswa];
        String[] matkul = new String[jumlahMahasiswa];
        double[] nilai = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nama: ");
            nama[i] = scanner.next();
            System.out.print("Mata Kuliah: ");
            matkul[i] = scanner.next();
            System.out.print("Nilai: ");
            nilai[i] = scanner.nextFloat();
        }

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n1. Cari Berdasarkan Nama");
            System.out.println("2. Cari berdasarkan mata kuliah");
            System.out.println("3. Cari berdasarkan nilai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            String pilihanMenu = scanner.next();

            switch (pilihanMenu) {
                case "1":
                    System.out.print("Masukkan data yang ingin dicari: ");
                    String dataCari = scanner.next();
                    sequentialSearch(nama, matkul, nilai, jumlahMahasiswa, dataCari);
                    break;
                case "2":
                    System.out.print("Masukkan data yang ingin dicari: ");
                    String dataCariMatkul = scanner.next();
                    sequentialSearch(nama, matkul, nilai, jumlahMahasiswa, dataCariMatkul);
                    break;
                case "3":
                    System.out.print("Masukkan data yang ingin dicari: ");
                    String dataCariNilai = scanner.next();
                    sequentialSearch(nama, matkul, nilai, jumlahMahasiswa, dataCariNilai);
                    break;
                case "4":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        }
        scanner.close();
    }

    public static void sequentialSearch(String[] nama, String[] matkul, double[] nilai, int jumlah, String dataCari) {
        boolean ditemukan = false;
        for (int i = 0; i < jumlah; i++) {
            if (nama[i].equalsIgnoreCase(dataCari) || matkul[i].equalsIgnoreCase(dataCari) || String.valueOf(nilai[i]).equalsIgnoreCase(dataCari)) {
                System.out.println("Data ditemukan:");
                System.out.println("Nama: " + nama[i]);
                System.out.println("Mata Kuliah: " + matkul[i]);
                System.out.println("Nilai: " + nilai[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }
}