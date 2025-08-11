import java.util.Scanner;

public class Praktikum6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbero = 0;
        int angka = 2;
        int jumlah = 0;
        System.out.println("Tentukan batas dari bilangan prima = ");
        int batasangka = input.nextInt();

        for (int i = angka;i<=batasangka;i++){ 
            numbero = 0; 
            for (int j=1;j<=i;j++) 
                if (i%j==0) {
                    numbero = numbero + 1;
                }
             if (numbero==2){
                System.out.println(i + " "); jumlah = jumlah + i; 
            } ;
        } System.err.printf("Jumlah nya adalah = %d", jumlah);
        
        input.close();
    }
    
}