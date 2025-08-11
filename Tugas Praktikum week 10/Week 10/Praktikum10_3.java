import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Praktikum10_3 {
    
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            File file = new File("output.txt");
            fileWriter = new FileWriter(file);
            int result = divide(10, 0);
            fileWriter.write("Hasil = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an aritmethic exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught an IO exception: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null)  {
                    fileWriter.close();
                    System.out.println("Resource berhasil ditutup!");
                }
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat menutup file: " + e.getMessage());
            }
        }
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return a / b;
        }
        
    }
}
