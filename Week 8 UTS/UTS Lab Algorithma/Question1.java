import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Gaji: ");
        int gaji = input.nextInt();

        int gajiperbulan = gaji * 8 * 25 -2000000;

        System.out.println("Nama Karyawan: "+ nama);
        System.out.println("Gaji perbulan: "+ gajiperbulan);

        input.close();

    }
}