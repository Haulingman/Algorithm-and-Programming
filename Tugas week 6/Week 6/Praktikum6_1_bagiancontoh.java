import java.util.Scanner;

public class Praktikum6_1_bagiancontoh {
    public static void main(String[] args) {
        int tebak = 0, jawab;
        jawab = (int) (100 * Math.random());
        Scanner myScan = new Scanner (System.in);
        System.out.println("Tebak angka 0 s/d 100"); 
        do {
            System.out.println("bilangan ? ");
            tebak = myScan.nextInt();
            if (tebak == jawab){
                System.out.print("Tepat.......");
            } 
            else if (tebak<jawab) {
                System.out.println("terlalu kecil...");
            }
            else {
                System.out.println("terlalu besar...");
            }
        }
        while (tebak != jawab);
    }
}
