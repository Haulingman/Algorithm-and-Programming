/**
 * p4
 */
import java.util.Scanner;
import java.util.ArrayList;
public class LatihanJava04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean opr = true;
        
        System.out.print("Input total item : ");
        int jawaban = scan.nextInt();
        scan.nextLine();
        
        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Integer> quantities = new ArrayList<Integer>();
        ArrayList<Integer> prices = new ArrayList<Integer>();
       
       
        for (int i = 1; i <= jawaban; i++) {
            System.out.printf("\nInput item name %d : ", i);
            String answer = scan.nextLine();
           
            System.out.print("Input item quantity : ");
            int quantity = scan.nextInt();
            scan.nextLine();
            
            System.out.print("Input item harga : ");
            int harga = scan.nextInt();
            scan.nextLine();
            
            items.add(answer);
            quantities.add(quantity);
            prices.add(harga);
        } 
        
        System.out.println("\nYour shopping list has been saved");
        
        while(opr){
        System.out.println("\n1. View shopping list");
        System.out.println("2. Calculate Grandtotal");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        int jawaban2 = scan.nextInt();

        if (jawaban2 == 1) {
            System.out.println("\nItem\t\tQuantity\t\tPrice");
            for (int f = 0; f < jawaban; f++) {
            System.out.printf("%s\t\t   %d\t\t        %d\t\t%n", items.get(f), quantities.get(f), prices.get(f));
        }
            System.out.print("Apakah anda ingin melakukan operasi lagi? (y/n)");
                char plhn = scan.next().charAt(0);
                if (plhn == 'n'){
                    opr = false;
                    System.out.println("\nTerima kasih");
        } 


        } if (jawaban2 == 2) {
            int grandTotal = 0;
                for (int f = 0; f < jawaban; f++) {
                int totalItemPrice = quantities.get(f) * prices.get(f);
                grandTotal += totalItemPrice;
        }
            
            System.out.println("\nGrand Total: " + grandTotal);
            System.out.print("\nApakah anda ingin melakukan operasi lagi? (y/n)");
            char plhn = scan.next().charAt(0);
                if (plhn == 'n'){
                    opr = false;
                    System.out.println("\nTerima kasih");
        }

        } else if (jawaban2 == 3){
            opr = false;
            System.out.println("\nTerima kasih");
        }
            
    }
    scan.close();
  }

}

    