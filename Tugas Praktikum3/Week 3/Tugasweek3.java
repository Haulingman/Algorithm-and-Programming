public class Tugasweek3 {
    public static void main(String[] args) {
        // Syarat MBKM mahasiswa
        int sks = 89;                           // batas minimal 90
        Boolean nilaijelek = false;             // harus false
        Boolean sosialisasimagang = false;      // harus true
        Boolean tempatkerja= true;              // harus true
        double ipk = 2.6;                       // minimal 2.5
        double durasikerja = 890;                // minimal 800

        if(sks<90 && nilaijelek == false && sosialisasimagang == true & tempatkerja == true & ipk>2.5 & durasikerja>800){
            System.out.println("Anda bisa mengambil MBKM");} 
        else{ 
        System.out.println("Anda belum bisa mengambil MBKM");}
    }
}
