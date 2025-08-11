package Kendaraan;

public class mobil {
        // Atribut
        String merk;
        String warna;
        int tahunProduksi;
    
        // Constructor
        public mobil(String merk, String warna, int tahunProduksi) {
            this.merk = merk;
            this.warna = warna;
            this.tahunProduksi = tahunProduksi;
        }
        // Method untuk menyalakan mobil
        public void nyalakanMobil() {
            System.out.println("Mobil " + merk + " dinyalakan.");
        }
    
        // Method untuk mematikan mobil
        public void matikanMobil() {
            System.out.println("Mobil " + merk + " dimatikan.");
        }
    
        // Method untuk menampilkan informasi mobil
        public void displayInfo() {
            System.out.println("Merk: " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun Produksi: " + tahunProduksi);
        }

        public static void main(String[] args) {
            // Membuat objek mobil1
            mobil mobil1 = new mobil("Toyota", "Hitam", 2016);
    
            // Menyalakan mobil1
            mobil1.nyalakanMobil();
    
            // Menampilkan informasi mobil1
            mobil1.displayInfo();
    
            // Mematikan mobil1
            mobil1.matikanMobil();
        }
    }
    
    


