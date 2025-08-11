public class TugasPraktikum2_JonathanChandra_00000094067 {
    public static void main(String[] args) {
        int semester, konsum, transport, komunikasi, akomodasi, kuliah, bukupelajaran;
        String Nama = "Jonathan Chandra";
        semester= 6;
        konsum = 40000; 
        transport = 55000;
        komunikasi = 150000;
        akomodasi = 1250000;
        kuliah = 8750000;
        bukupelajaran = 1300000;

        double hasil = (konsum*(365*3)) + (transport*(52*3)) + (komunikasi*(12*3)) + (bukupelajaran*(12*3)) + (kuliah*(2*3)) ;

        System.out.printf("Nama : %s \n" ,Nama);
        System.out.printf("Semester : %s \n" ,semester);
        System.out.printf("==== MASUKKAN DETAIL BIAYA ==== \n");
        System.out.printf(" Biaya Konsumsi/hari                     : %d\n" ,konsum);
        System.out.printf(" Biaya Transportasi/minggu               : %d\n" ,transport);
        System.out.printf(" Biaya Akomodasi/bulan                   : %d\n" ,akomodasi);
        System.out.printf(" Biaya Komunikasi/bulan                  : %d\n" ,komunikasi);
        System.out.printf(" Biaya Kuliah/Semester                   : %d\n" ,kuliah);
        System.out.printf(" Biaya Buku Pelajaran/Semester           : %d\n" ,bukupelajaran);

        System.out.printf("Halo, %s.",Nama);
        System.out.printf(" Kamu sudah Kuliah selama %d Semester.",semester);
        System.out.printf(" Biaya yang sudah keluarkan sebesar %,.2f ", hasil);
    }
}
