public class Praktikum3_4 {

    public static void main(String[] args) {
        int stokbuku = 5;
        boolean kartuanggotaValid = true;

        if ( stokbuku> 0 && kartuanggotaValid) {
            System.out.println("Anda dapat meminjam buku ini.");
        } else {
            System.out.println("Maaf, buku tidak tersedia atau kartu anggota tidak valid");
        }
    }
}