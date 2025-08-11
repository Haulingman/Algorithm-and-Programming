import java.util.Scanner;

public class Praktikum6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //input scanner
        int bilangan = 1;
        int sum = 0, i=0;
       System.out.println("menghitung rata rata");  
        System.out.print("Masukan Jumlah data\n" );
           bilangan = scan.nextInt();   //input bilangan

        for (i = 1; i <= bilangan ; i++) {            
           System.out.printf("\nNilai ke-%d = %d",i,i); //memproses angka output
           sum = sum + i;   // menampung output bilagan 
       }
       System.out.println("\njumlah Bilangan : " + sum);    // penjumlahan
        Double rata = (double) sum / (double) (i-1);    //untuk menghitung rata rata
        System.out.println("Nilai rata rata :" +rata);  // meng output rata rata
        scan.close();;
}
    }

