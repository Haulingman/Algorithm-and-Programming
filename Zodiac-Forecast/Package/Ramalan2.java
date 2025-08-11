package Package;

import java.util.Scanner;

public class Ramalan2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Ramalan[] predictions = initializeRamalan();
        Ramalan[] p = new Ramalan[12];
        menu(predictions);
    }

    // Metode inisialisasi ramalan
    public static Ramalan[] initializeRamalan() {
        return new Ramalan[]{
                new Ramalan("Aries", "Api", "Domba", "Anda akan mengalami peningkatan dan pencapaian pada karier anda", 5),
                new Ramalan("Taurus", "Bumi", "Banteng", "Anda akan mengalami peningkatan yang stabil dan peluang mungking akan datang", 4),
                new Ramalan("Gemini", "Udara", "2 Bersaudara", "Anda akan merasakan perubahan yang signifikan dibanding tahun sebelumnya", 3),
                new Ramalan("Cancer", "Air", "Kepitintg", "Anda akan menghadapin tantangan baru, namun hal ini dapat menjadi peluang anda", 2),
                new Ramalan("Leo", "Api", "Singa", "Bersiaplah! Anda akan mengalami peningkatan drastis dibanding tahun sebelumnya", 3),
                new Ramalan("Virgo", "Bumi", "Gadis", "Sekarang merupakan waktu yang tepat untuk menyempurnakan hidup anda ", 3),
                new Ramalan("Libra", "Udara", "Timbangan", "Bersiaplah! Tahun ini akan menjadi tahun yang sempurna untuk anda", 5),
                new Ramalan("Scorpio", "Air", "Kalanengking", "Tahun ini akan menjadi waktu yang tepat untuk bangkit dari keterpurukan", 3),
                new Ramalan("Sagittarius", "Api", "Kuda", "Tahun ini akan menjadi waktu yang sempurna untuk peningkan direi anda", 4),
                new Ramalan("Capricorn", "Bumi", "Kambing", "Bersiaplah! Tahun ini akan menjadi bayaranmu atas kerja keras mu", 4),
                new Ramalan("Aquarius", "Udara", "Air", "Tahun ini akan menjadi tahun yang sempurna untukb pertumbuhan anda", 5),
                new Ramalan("Pisces", "Air", "Ikan", "Bertahanlah! Tahun ini akan menjadi masa transformasi anda", 1),
    
        };
    }

    public static void bubbleSortP(Ramalan[] p) {
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - i - 1; j++) {
                if (Integer.parseInt(p[j].getRamalan()) > Integer.parseInt(p[j + 1].getRamalan())) {
                    Ramalan temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

    public static void binarySearchingQ(Ramalan[] p, String inputramalan) {
        int first = 0;
        int last = p.length - 1;
        String searchValue = inputramalan;
    
        while (first <= last) {
            int mid = (first + last) / 2;
            String ramalanValue = p[mid].getRamalan();
    
            if (ramalanValue.compareTo(searchValue) < 0) {
                first = mid + 1;
            } else if (ramalanValue.equals(searchValue)) {
                System.out.println("Ramalan untuk " + inputramalan + " ada di indeks: " + mid);
                return;
            } else {
                last = mid - 1;
            }
        }
        System.out.println("Ramalan untuk " + inputramalan + " tidak ditemukan.");
    }

    public static void menu(Ramalan[] predictions) {
        System.out.print("Masukan nama anda     : ");
        String name = scan.nextLine();
        System.out.print("Masukan zodiak anda   : ");
        String zodiak = scan.nextLine();
        for (Ramalan prediction : predictions) {
            if (prediction.getNama().equalsIgnoreCase(zodiak)) {
                System.out.println("\nHasil Ramalan:");
                System.out.println("Nama Zodiak: " + prediction.getNama());
                System.out.println("Ramalan: " + prediction.getRamalan());
                break;
            }
        }
    }
    
}