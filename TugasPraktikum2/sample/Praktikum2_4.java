public class Praktikum2_4 {
    public static void main(String[] args) {
        //String awal
        double tinggi_meter = 1.9;

        //Mengoversi tinggi dari meter ke sentimeter
        double tinggi_cm = tinggi_meter * 100;
        
        double berat_ideal = ((tinggi_cm - 100) - (tinggi_cm-100)*10/100);

        //Menampilkan hasilnya 
        System.out.println("Berat Badan Ideal");
        System.out.println("Tinggi Badan" + " " + "=" + " " + tinggi_meter + "meter");
        System.out.println("Berat badan" + " " + "=" + " " + berat_ideal + "kg");
    }
}
