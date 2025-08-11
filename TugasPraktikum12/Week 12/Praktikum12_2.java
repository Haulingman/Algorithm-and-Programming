import java.util.Scanner;
public class Praktikum12_2 {
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

            selectionsort(arr, size);

            System.out.print("\narray setelah diurutkan :");
            printarray(arr, size);
    }

    static void selectionsort(int [] arr, int size){
        for(int i = 0; i<size - 1; i++ ){
            int minIndex = i;
           for(int j =i + 1; j<size;j++){
             if (arr[j]<arr[minIndex]) {
                minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]  = arr[i];
            arr[i]=temp;           
        }
    }

    static void printarray ( int [] arr, int size){
        for(int i = 0; i< size;i++){
            System.out.print(arr[i]+" |");
        }
    }
}