import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Praktikum9_5 {
    static FileInputStream fis;
    static FileOutputStream fos;

    public static void main(String[] args) {
        String inputfile = "Prak9.txt";
        String outputfile = "New_prak9.txt";

        bukafile(inputfile, outputfile);
        bacadantuliskefile(outputfile);
        tutupfile();
    }

    public static void bukafile(String inputfile, String outputfile) {
        try{
            fis = new FileInputStream(inputfile);
            fos = new FileOutputStream(outputfile);
        } catch (IOException e){
            System.err.println("Terjadi kesalahan saat membuka file");
        }
    }

    public static void bacadantuliskefile(String outputfile) {
        try{
            byte[] buffer = new byte[1024];
            int bytesread;

            while ((bytesread = fis.read(buffer)) != -1 ) {
                fos.write(buffer,0,bytesread);
            }
            System.out.println("Data anda sudah disalin ke " + outputfile);
        } catch (IOException e) {
            System.err.println("terjadi kesalahan saat memindahkan data ");
        }
    }

    public static void tutupfile() {
        try {
            if (fis != null) fis.close();
            if (fos != null) fos.close();
        } catch (IOException e){
        System.err.println("Terjadi kesalahan saat membaca file ");
 }
}
}

