 public class Mahasiswa { 
 private String nama; private int nim;

 public Mahasiswa(String nama, int nim) { this.nama = nama; this.nim = nim; }

 public void tampilkanData() { System.out.println("Nama: " + nama); System.out.println("NIM: " + nim); }

 protected void ubahNama(String namaBaru) { this.nama = namaBaru; }

 void ubahNim(int nimBaru) { this.nim = nimBaru; } }
