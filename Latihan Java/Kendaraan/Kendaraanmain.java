package Kendaraan;

public class Kendaraanmain {
    public static void main(String[] args) {
                motor motor1 = new motor("Honda", "Merah", 2020);
                // Menyalakan motor1
                motor1.nyalakanMotor();
        
                // Menampilkan informasi motor1
                motor1.displayInfo();
        
                // Mematikan motor1
                motor1.matikanMotor();


                motor motor2 = new motor("Yamaha", "Biru", 2018);
                // Menyalakan motor2
                motor2.nyalakanMotor();
        
                // Menampilkan informasi motor2
                motor2.displayInfo();
        
                // Mematikan motor2
                motor2.matikanMotor();

                

                mobil mobil1 = new mobil("Toyota", "Hitam", 2016);
                // Menyalakan mobil1
                mobil1.nyalakanMobil();
        
                // Menampilkan informasi mobil1
                mobil1.displayInfo();
        
                // Mematikan mobil1
                mobil1.matikanMobil();

                

                mobil mobil2 = new mobil("Mercedes", "Putih", 2017);
                // Menyalakan mobil1
                mobil2.nyalakanMobil();
        
                // Menampilkan informasi mobil2
                mobil2.displayInfo();
        
                // Mematikan mobil2
                mobil2.matikanMobil();
            }
        }

