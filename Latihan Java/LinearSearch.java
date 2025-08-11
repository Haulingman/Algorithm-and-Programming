public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 8;

        int result = linearSearch(array, target);

        if (result == -1) {
            System.out.println("Elemen tidak ditemukan");
        } else {
            System.out.println("Elemen ditemukan di indeks: " + result);
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}


