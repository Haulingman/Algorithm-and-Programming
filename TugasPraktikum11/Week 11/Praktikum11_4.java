import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Praktikum11_4 {
    public static void main(String[] args) {
        // Nama file input
        String inputFile = "favouriteplace.txt";
        // Nama file output
        String outputFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));


            System.out.println("Five favourite place for Mav's student:\n");
            writer.write("Five favourite place for Mav's student:\n");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                
                if (parts.length >= 2) {
                    String placeName = parts[0];

                    if (isNumeric(parts[parts.length - 1])) {
                        double rating = Double.parseDouble(parts[parts.length - 1]);
                        System.out.println("+ " + placeName + " dengan rating " + rating);
                        writer.write("+ " + placeName + " dengan rating " + rating + "\n");
                    } else {
                        System.err.println("Rating tidak valid untuk tempat: " + line);
                    }
                } else {
                    System.err.println("Format tidak valid: " + line);
                }
            }

            reader.close();
            writer.close();

            System.out.println("\nProgram selesai. Hasil output tersimpan di " + outputFile);
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
