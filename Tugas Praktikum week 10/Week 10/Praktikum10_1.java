import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Praktikum10_1 {
    public static void main(String[] args) {
     try {
        bacaFile("contohFile.txt");
     } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
     }  
    }

    public static void bacaFile(String fileName) throws FileNotFoundException {
        File file = new File (fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine());
            String data = scanner.nextLine();
            System.out.println(data);
        }
    }


    
    
}
