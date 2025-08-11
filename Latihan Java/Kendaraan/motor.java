package Kendaraan;

public class motor {
        // Atribut
        String merk;
        String warna;
        int tahunProduksi;
        
        // Constructor
        public motor(String merk, String warna, int tahunProduksi) {
            this.merk = merk;
            this.warna = warna;
            this.tahunProduksi = tahunProduksi;
        }
    
        // Method untuk menyalakan motor
        public void nyalakanMotor() {
            System.out.println("Motor " + merk + " dinyalakan.");
        }
    
        // Method untuk mematikan motor
        public void matikanMotor() {
            System.out.println("Motor " + merk + " dimatikan.");
        }
    
        // Method untuk menampilkan informasi motor
        public void displayInfo() {
            System.out.println("Merk: " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun Produksi: " + tahunProduksi);
        }
    
        public static void main(String[] args) {
            // Membuat objek motor1
            motor motor1 = new motor("Honda", "Merah", 2020);
    
            // Menyalakan motor1
            motor1.nyalakanMotor();
    
            // Menampilkan informasi motor1
            motor1.displayInfo();
    
            // Mematikan motor1
            motor1.matikanMotor();
        }
    }

