import java.util.Scanner;

public class Praktikum14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Ukuran Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Masukan Angka :");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        System.out.print("Masukan angka yang ingin dicari: ");
        int searchElement = scanner.nextInt();
        int index = binarySearch(array, searchElement);
        if (index == -1) {
            System.out.println("Angka tidak ditemukan.");
        } else {
            System.out.println("Angka ditemukan pada index ke: " + (index + 1));
        }
        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}