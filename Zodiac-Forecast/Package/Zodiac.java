package Package;
import Package.Ramalan;
import Package.Struk;
import java.util.ArrayList;
import java.util.Scanner;

public class Zodiac {
    static Scanner scan = new Scanner(System.in);
    static Ramalan2 ramalan2 = new Ramalan2();

    public static void main(String[] args) {
        Zodiak[] a = new Zodiak[12];
        initializeZodiacs(a);
        menu(a);
    }

    public static void initializeZodiacs(Zodiak[] a) {
        a[0] = new Zodiak("Aries", "21 Maret - 19 April", "Berani, Energik", "Api", "Domba");
        a[1] = new Zodiak("Taurus", "20 April - 20 Mei", "Pendiam, Bertahan", "Bumi", "Banteng");
        a[2] = new Zodiak("Gemini", "21 Mei - 20 Juni", "Adaptable, Sosial", "Udara", "2 bersaudara");
        a[3] = new Zodiak("Cancer", "21 Juni - 22 Juli", "Penuh Perasaan, Sensitif", "Air", "Kepiting");
        a[4] = new Zodiak("Leo", "23 Juli - 22 Agustus", "Penuh Energi, Pemimpin", "Api", "Singa");
        a[5] = new Zodiak("Virgo", "23 Agustus - 22 September", "Praktis, Analitis", "Bumi", "Gadis");
        a[6] = new Zodiak("Libra", "23 September - 22 Oktober", "Harmonis, Diplomatis", "Udara", "Timbangan");
        a[7] = new Zodiak("Scorpio", "23 Oktober - 21 November", "Penuh Misteri, Intens", "Air", "Kalajengking");
        a[8] = new Zodiak("Sagittarius", "22 November - 21 Desember", "Optimis, Petualang", "Api", "Kuda");
        a[9] = new Zodiak("Capricorn", "22 Desember -2 19 Januari", "Ambisius, Disiplin", "Bumi", "Kambing");
        a[10] = new Zodiak("Aquarius", "20 Januari - 18 Februari", "Inovatif, Humanitarian", "Udara", "Air");
        a[11] = new Zodiak("Pisces", "19 Februari - 20 Maret", "Imajinatif, Romantis", "Air", "Ikan");

    }

    public static void menu(Zodiak[] a) {
        int pilihan;
        String fileName = "Zodiac.txt";
        do {
            System.out.println("========== Selamat datang di Sistem Konstelasi 12 Zodiak ==========");
            System.out.println("1. Informasi Zodiak");
            System.out.println("2. Ramalan");
            System.out.println("3. Tampilkan Informasi Zodiak");
            System.out.println("4. Hapus data sebelumnya");
            System.out.println("5. Update data");
            System.out.println("6. Keluar");
            System.out.print("Silakan pilih (1-6) : ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    displayZodiacInfo(a);
                    break;
                case 2: 
                    Ramalan2.main(new String[0]);
                    break;
                case 3: 
                    Struk.readFile(fileName); // Call the bacaFile method from Struk class
                    break;
                case 4:
                scan.nextLine(); // Membersihkan buffer sebelumnya
                Struk.deleteFile(fileName); 
                break;
                case 5:
                    updateZodiacData(a);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan Sistem Konstelasi 12 Zodiak");
                    break;
            }
        } while (pilihan != 6);
    }

    public static void updateZodiacData(Zodiak[] a) {
    System.out.println("Masukkan indeks zodiak yang ingin diperbarui (0-11): ");
    int indexToUpdate = scan.nextInt();

    if (indexToUpdate >= 0 && indexToUpdate < a.length) {
        System.out.println("Data zodiak sebelum diperbarui:");
        System.out.println(a[indexToUpdate].toString());

        System.out.println("Masukkan informasi zodiak yang baru:");
        scan.nextLine(); // Clear the buffer
        System.out.print("Nama: ");
        String namaBaru = scan.nextLine();
        System.out.print("Periode: ");
        String periodeBaru = scan.nextLine();
        System.out.print("Karakter: ");
        String karakterBaru = scan.nextLine();
        System.out.print("Elemen: ");
        String elemenBaru = scan.nextLine();
        System.out.print("Hewan: ");
        String hewanBaru = scan.nextLine();

        // Update the data in the array
        a[indexToUpdate] = new Zodiak(namaBaru, periodeBaru, karakterBaru, elemenBaru, hewanBaru);

        // Read existing data from the file
        ArrayList<String> existingData = Struk.readFile("Zodiac.txt");

        // Update the data in the file
        existingData.set(indexToUpdate,
                String.format("%s,%s,%s,%s,%s", namaBaru, periodeBaru, karakterBaru, elemenBaru, hewanBaru));

        // Rewrite all data to the file
        Struk.writeToFile("Zodiac.txt", existingData);

        System.out.println("Data zodiak berhasil diperbarui!");
    } else {
        System.out.println("Indeks zodiak tidak valid.");
    }
}



    public static void displayZodiacInfo(Zodiak[] a) {
        System.out.print("Masukan nama anda: ");
        scan.nextLine(); // Membersihkan buffer sebelumnya
        String name = scan.nextLine();
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = scan.nextInt();
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = scan.nextInt();

        int indexZodiak = calculateZodiacIndex(bulan, tanggal);
        if (indexZodiak != -1) {
            System.out.println("Informasi Zodiak Anda:");
            System.out.println("Nama     : " + name);
            System.out.println("Zodiak   : " + a[indexZodiak].getNama());
            System.out.println("Periode  : " + a[indexZodiak].getPeriode());
            System.out.println("Karakter : " + a[indexZodiak].getKarakter());
            System.out.println("Elemen   : " + a[indexZodiak].getElemen());
            System.out.println("Bentuk   : " + a[indexZodiak].getHewan());
            Struk.writeToFile(name, a[indexZodiak]); // Corrected class reference for writeToFile method
        } else {
            System.out.println("Input Anda tidak valid");
        }
    }

    public static int calculateZodiacIndex(int bulan, int tanggal) {
        int indexZodiak = -1;
        switch (bulan) {
            case 1:
                if (tanggal >= 20) {
                    indexZodiak = 10;
                } else if (tanggal <= 18) {
                    indexZodiak = 9;
                }
                break;
                case 2:
                    if (tanggal >= 19) {
                        indexZodiak = 11;
                    } else if (tanggal <= 20) {
                        indexZodiak = 10; 
                    }
                    break;
                case 3:
                    if (tanggal >= 21) {
                        indexZodiak = 0; 
                    } else if (tanggal <= 20) {
                        indexZodiak = 11; 
                    }
                    break;
                case 4:
                    if (tanggal >= 20) {
                        indexZodiak = 1; 
                    } else if (tanggal <= 20) {
                        indexZodiak = 0; 
                    }
                    break;
                case 5:
                    if (tanggal >= 21) {
                        indexZodiak = 2; 
                    } else if (tanggal <= 20) {
                        indexZodiak = 1; 
                    }
                    break;
                case 6:
                    if (tanggal >= 21) {
                        indexZodiak = 3;
                    } else if (tanggal <= 22) {
                        indexZodiak = 2;
                    }
                    break;
                case 7:
                    if (tanggal >= 23) {
                        indexZodiak = 4; 
                    } else if (tanggal <= 22) {
                        indexZodiak = 3; 
                    }
                    break;
                case 8:
                    if (tanggal >= 23) {
                        indexZodiak = 5; 
                    } else if (tanggal <= 22) {
                        indexZodiak = 4; 
                    }
                    break;
                case 9:
                    if (tanggal >= 23) {
                        indexZodiak = 6; 
                    } else if (tanggal <= 22) {
                        indexZodiak = 5; 
                    }
                    break;
                case 10:
                    if (tanggal >= 23) {
                        indexZodiak = 7; 
                    } else if (tanggal <= 21) {
                        indexZodiak = 6;
                    }
                    break;
                case 11:
                    if (tanggal >= 22) {
                        indexZodiak = 8; 
                    } else if (tanggal <= 21) {
                        indexZodiak = 7; 
                    }
                    break;
                case 12:
                    if (tanggal >= 22) {
                        indexZodiak = 9; 
                    } else if (tanggal <= 19) {
                        indexZodiak = 8; 
                    }
                    break;
                default:
                    break;
            }


        return indexZodiak;
    }
}
