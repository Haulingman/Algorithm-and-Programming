public class Praktikum3_1 {
    // Atribut-atribut produk 
        public static final int ATRIBUT_A = 1; //Bit 0
        public static final int ATRIBUT_B = 2; //Bit 1
        public static final int ATRIBUT_C = 4; //Bit 2
        public static final int ATRIBUT_D = 8; //Bit 3
    public static void main(String[] args) {
       int atributproduk = 0; //Atribut produk awalnya dinonaktifkan (semua bit 0)  

       //Mengaktifkan atribut A dan B 
       atributproduk |= ATRIBUT_A | ATRIBUT_B;
       
       //Menonaktifkan atribut B 
       atributproduk &= ~ATRIBUT_B;
       
       //Memeriksa apakah atribut C aktif
       boolean cekATRIBUT_C = (atributproduk & ATRIBUT_C) !=0;
       if (cekATRIBUT_C) {
        System.out.println("Atribut C aktif.");
       } else {
        System.out.println("Atribut C nonaktif");
       }
    }
}
