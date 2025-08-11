import java.util.Scanner;

public class Praktikum14_3 {
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
        int index = interpolationSearch(array, searchElement);
        if (index != -1) {
            System.out.println("Angka ditemukan pada index ke : " + index);
        } else {
            System.out.println("Angka tidak ditemukan. ");
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

    public static int interpolationSearch(int[] array, int searchElement) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high && searchElement >= array[low] && searchElement <= array[high]) {
            if (low == high) {
                if (array[low] == searchElement) {
                    return low;
                }
                return -1;
            }
            int Pos = low + (((high - low) / (array[high] - array[low])) * (searchElement - array[low]));
            if (array[Pos] == searchElement) {
                return Pos;
            }
            if (array[Pos] < searchElement) {
                low = Pos + 1;
            } else {
                high = Pos - 1;
            }
        }
        return -1;
    }
}