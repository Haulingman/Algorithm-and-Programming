import java.util.Scanner;

public class Praktikum14_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Ukuran Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Masukan Angka :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Masukan angka yang ingin dicari: ");
        int searchElement = scanner.nextInt();
        int index = sequentialSearch(array, searchElement);

        if (index != -1) {
            System.out.println("Angka ditemukan pada index ke : " + index);
        } else {
            System.out.println( "Angka tidak ditemukan.");
        }

        scanner.close();
    }

    private static int sequentialSearch(int[] array, int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}