import java.util.Scanner;
public class LatihanJava05 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Siapa Nama? ");
            String nama = scanner.nextLine();

            System.out.println("Berapa umur anda? ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Makanan favorite? ");
            String food = scanner.nextLine();

            System.out.println("Hello "+nama);
            System.out.println("Anda berumur "+age);
            System.out.println("Makanan favorite anda "+food);
        }
    }
}
