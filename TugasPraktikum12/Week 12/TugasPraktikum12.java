import java.util.ArrayList;
import java.util.Scanner;

public class TugasPraktikum12_JonathanChandra {
    static ArrayList<Book> Books = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Masukkan judul dan stock buku");
            System.out.println("2. Sort berdasarkan judul");
            System.out.println("3. Sort berdasarkan stock");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    sortAndDisplay("judul");
                    break;
                case 3:
                    sortAndDisplay("stock");
                    break;
                case 4:
                    System.out.println("Terima kasih! Keluar dari program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-4.");
            }
        }
    }

    static void addBook(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan stock buku: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); 

        Books.add(new Book(title, stock));
        System.out.println("Buku berhasil ditambahkan!");
    }

    static void sortAndDisplay(String sortBy) {
        System.out.println("Sebelum diurutkan berdasarkan " + sortBy + " :");
        displayBooks();

        int n = Books.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if ((sortBy.equals("judul") && Books.get(i - 1).title.compareTo(Books.get(i).title) > 0) ||
                        (sortBy.equals("stock") && Books.get(i - 1).stock > Books.get(i).stock)) {
                    // Swap elements
                    Book temp = Books.get(i - 1);
                    Books.set(i - 1, Books.get(i));
                    Books.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);

        System.out.println("Setelah diurutkan berdasarkan " + sortBy + " :");
        displayBooks();
    }

    static void displayBooks() {
        for (Book Book : Books) {
            System.out.println("Judul: " + Book.title + ", Stock: " + Book.stock);
        }
        System.out.println();
    }
}