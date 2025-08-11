import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;
import java.util.NoSuchElementException ;

public class Praktikum11_2 {
    private Formatter output;

    public void bukafile(){
        try {
            output = new Formatter("cobadata.txt");
        } catch (SecurityException excpt1) {
            System.err.println("Anda tidak boleh "+"Menulis ke file ini");
            System.exit(1);
        }catch(FileNotFoundException excpt2) {
            System.out.println("File tidak ditemukan");
            System.exit(1);
        }
    }

public void menambahkandata(){
    Scanner myscan = new Scanner(System.in);
    System.out.print("Masukkan no,nama,dan sisa dana (Ketik 'Selesai' untuk berhenti) :");
    while (myscan.hasNext()) {
        try{
            String input = myscan.next();
            if (input.equalsIgnoreCase("Selesai")) {
                break;
            }
        int no = Integer.parseInt(input);
        String nama =myscan.next();
        double sisadana = myscan.nextDouble();
        String sperator =System.getProperty("line.separator");
        output.format("%d %s %.2f%s", no, nama, sisadana, sperator);

        }catch (FormatterClosedException e){
            System.err.println("Error ketika menulis ke file");
            return;
        }catch(NoSuchElementException e){
            System.err.println("Terjadi Kesalahan input");
            myscan.nextLine();
        }catch(NumberFormatException e){
            System.err.println("Format Nomor salah ");
            myscan.nextLine();
        }
        System.out.print("Masukkan no,nama,dan sisa dana (ketik 'selesai' untuk berhenti ) :");

    }
}

public void menutupfile(){
if (output != null) {
    output.close();
}
}

public static void main(String[] args) {
    Praktikum11_2 cobaan = new Praktikum11_2();
    cobaan.bukafile();
    cobaan.menambahkandata();
    cobaan.menutupfile();
}
}

