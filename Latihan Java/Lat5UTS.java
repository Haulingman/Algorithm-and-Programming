import java.util.Scanner;

/**
 * Lat5UTS
 */
public class Lat5UTS {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" === My Pertamina ===");

        System.out.print("Vehicle Type :\n1. Motorcycle\n2. Car\n3. Bus\n4. Truck\n");
        System.out.print("Input Vehichle Type :");
        int pilihan = input.nextInt();

        System.out.print("Input engine size : ");
        int cc = input.nextInt();

        System.out.print("Input Total Fuel :");
        int fuel = input.nextInt();
        int harga,jumlah;

        switch (pilihan) {
            case 1:
                if (cc <= 1000) {
                    harga = 10000;
                    jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR : %d ",jumlah);
                } else if (cc >= 1001 && cc <= 2000 ) {
                    harga = 12000;
                    jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR : %d",jumlah);
                } else if (cc >= 2001 && cc <= 3000) {
                    harga = 15000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR : %d ",jumlah);
                } else {
                    harga = 0;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                }
                break;
            case 2 :
                if (cc <= 1000) {
                    harga = 13000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else if (cc >= 1001 && cc <= 2000 ) {
                    harga = 15000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else if (cc >= 2001 && cc <= 3000) {
                    harga = 18000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else {
                    harga = 21000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                }
                break;
            case 3 :
                if (cc <= 1000) {
                    harga = 0;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else if (cc >= 1001 && cc <= 2000 ) {
                    harga = 0;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else if (cc >= 2001 && cc <= 3000) {
                    harga = 15000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else {
                    harga = 17000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                }
                break;
            case 4 :
                if (cc <= 1000) {
                    harga = 0;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else if (cc >= 1001 && cc <= 2000 ) {
                    harga = 12000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);

                } else if (cc >= 2001 && cc <= 3000) {
                    harga = 15000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                } else {
                    harga = 17000;
                     jumlah = harga * fuel;
                    System.out.printf("You need to pay IDR :%d ",jumlah);
                }
                break;
        
            default:
            System.out.println("Input Error, Silahkan Coba Ulang");
            input.close();
                break;
        }
        
        


    }
}