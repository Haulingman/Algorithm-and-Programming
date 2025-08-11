import java.io.FileReader;
import java.io.IOException;

public class Praktikum9_4 {
    static FileReader reader;
    public static void main(String[] args) {
       bukafile();
       bacafile();
       tutupfile(); 
    }
    private static void bukafile() {
        try{
            reader = new FileReader("menu.txt");
        } catch (IOException e ) {
            System.out.println("terjadi kealahan saat membuka file");
        }
    }
    private static void bacafile() {
        try{
            int karakter ;
            while ((karakter = reader.read()) != -1) {
                System.out.println((char) karakter);
            }
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca file");
        }
    }
    private static void tutupfile() {
        try{
            if(reader != null)
                reader.close();
        } catch (IOException e ){ 
            System.err.println("Terjadi kesalahan saat menutup file");
 }
}
}