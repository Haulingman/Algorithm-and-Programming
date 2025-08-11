// Kelas induk
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara");
    }
}

// Kelas anak mewarisi dari kelas Hewan
class Anjing extends Hewan {
    // Override metode bersuara() dari kelas Hewan
    void bersuara() {
        System.out.println("Anjing menggonggong");
    }

    // Metode khusus untuk kelas Anjing
    void fetch() {
        System.out.println("Anjing membawa bola");
    }
}

public class ContohPolimorfisme {
    public static void main(String[] args) {
        // Membuat objek dari kelas anak
        Anjing anjingSaya = new Anjing();

        // Memanggil metode bersuara() pada objek kelas anak
        anjingSaya.bersuara(); // Output: Anjing menggonggong

        // Menggunakan polimorfisme: Menganggap objek Anjing sebagai objek Hewan
        Hewan hewanSaya = new Anjing();
        hewanSaya.bersuara(); // Output: Anjing menggonggong

        // Tidak dapat memanggil metode fetch() menggunakan tipe Hewan
        // hewanSaya.fetch(); // Ini akan menghasilkan kesalahan kompilasi

        // Memanggil metode fetch() setelah mengonversi tipe kembali ke Anjing
        ((Anjing) hewanSaya).fetch(); // Output: Anjing membawa bola
    }
}
