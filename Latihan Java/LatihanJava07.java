import java.io.File;
import java.util.Scanner;
/**
 * LatihanJava07
 */
public class LatihanJava07 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String alamat = System.getProperty ("user.home") + "/Desktop/E:/Jonithan/Latihan Java";
        File fileDicari = new File(alamat); 
        System.out.println(fileDicari.isFile());

    }

    public static void ObservasiFile(String alamatFile) {
       File fileDicari = new File (alamatFile); 
       if (fileDicari.exists());
       System.out.printf("%s %s/n", alamatFile, "ada");      
    }
    
}

    

