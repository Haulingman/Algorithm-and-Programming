import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        float a,b;
        operator karakter;

        System.out.println("===Simple Calculator===");
        System.out.println("Input A: ");
        int angka = input.nextInt();

        System.out.println("Input B: ");
        int angka2 = input.nextInt();

        System.out.println("Input Operator (+ / -): ");
        Object operator = input.nextLine();

        if ((boolean) (operator = '+'));{
            int hasil = angka + angka2;
        System.out.println("hasil "+hasil); 
        } if ((boolean) (operator = '-'));{
            int hasil = angka + angka2;
        System.out.println("hasil "+hasil);
        }
        
        System.out.println();

    }
}
