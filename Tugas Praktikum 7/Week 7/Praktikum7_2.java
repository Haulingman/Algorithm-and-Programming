import java.util.Scanner;

public class Praktikum7_2 {
	public static void main(String[] args) {
		String [] kataNama;
        int jumlahKata;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama lengkap: ");
            String fullName = input.nextLine();

            // Memisahkan nama menjadi kata-kata
            kataNama = fullName.split(" ");
        }
        

        jumlahKata = kataNama.length;

        // Menampilkan kata-kata
        System.out.println("Jumlah kata pada nama anda: " + jumlahKata);
        for (int i = 0; i < jumlahKata ;i++) {
            System.out.print("|" + kataNama[i] + " |") ;
}

}
}
