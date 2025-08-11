
import java.util.InputMismatchException;
import java.util.Scanner;

	public class Praktikum10_4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("Masukkan bilangan pertama: ");
	                int bil1 = scanner.nextInt();
	                System.out.print("Masukkan bilangan kedua: ");
	                int bil2 = scanner.nextInt();
	                if (bil1==0) {
	                	System.out.println("Pembagian oleh nol tidak diperbolehkan.");
	                } else if (bil2==0) {
	                	System.out.println("Pembagian oleh nol tidak diperbolehkan.");
	                } else {
	                	int result = (int) bil1 / bil2;
	                	System.out.println("Hasil pembagian bilangan yang dimasukkan: " + result);
		                break;
	                }
	                
	            } catch (InputMismatchException e) {
	                System.out.println("Input tidak valid! Harap masukkan bilangan bulat.");
	                scanner.next(); 
	                
	            } catch (ArithmeticException e) {
	                System.out.println("Pembagian oleh nol tidak diizinkan.");
	            }
	        }

	        scanner.close();
	}
	}