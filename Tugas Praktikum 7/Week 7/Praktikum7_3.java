import java.util.Scanner;

public class Praktikum7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan jumlah index array: ");
        int max = input.nextInt();

        int arr[] = new int [max];
        for(int i=0; i<max; i++){
            System.out.printf("Input number %d: ", i+1);
                arr[i] = input.nextInt();    
    }
        for(int i=0; i<max; i++){
            System.out.printf("Arr [%d]: %d \n", arr[i], i );
    }
        //penambahan
        int sum = 0;
        for(int i=0; i<max; i++){
               System.out.printf("Arr [%d]: %d \n", arr[i], i );
            sum = sum + arr[i];            
            }
            System.out.printf("Total Penambahan: %d", sum);
        input.close();;
}}
