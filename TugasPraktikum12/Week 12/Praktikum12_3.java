import java.util.Scanner;

public class Praktikum12_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int [100];
        int input;
        int size = 0;

        System.out.println("Masukkan angka yang ingin diurutkan(ketik 0 untuk selesai ) :");

        do {
            System.out.print("angka : ");
            input = scan.nextInt();

                if (input != 0) {
                    arr[size] = input;
                    size++;
                }
        } while (input !=0);
            System.out.print("\nArray Sebelom diurutkan :");
            printarray(arr, size);

            insertionsort(arr, size);

            System.out.print("\narray setelah diurutkan :");
            printarray(arr, size);
    }

    static void insertionsort(int [] arr, int size){
        for( int i = 0; i < size - 1; i++){
            int key = arr[i];
            int j = i  - 1;

            while (j >= 0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
            
    }

    static void printarray ( int [] arr, int size){
        for(int i = 0; i< size;i++){
            System.out.print(arr[i]+" | ");
        }
    }
}