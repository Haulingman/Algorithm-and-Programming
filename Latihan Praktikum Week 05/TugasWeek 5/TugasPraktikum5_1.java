import java.util.Scanner;

public class TugasPraktikum5_1 {

    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Umur: 125 "); 
            String umur = input.nextLine();
            if(isValidNIM(umur)) {
                System.out.println("UMUR \"" + umur + "\" valid.");
            } else {
                System.out.println("UMUR \"" + umur + "\" tidak valid. Harus terdiri dari umur 1 sampai 125");
            }
            input.close();
        }
        
    }

    private static boolean isValidNIM(String umur) {
        if (umur.length() == 3 && umur.matches("\\d+")){
            return true;
        } else {
            return false;
        }
        
    }
}

