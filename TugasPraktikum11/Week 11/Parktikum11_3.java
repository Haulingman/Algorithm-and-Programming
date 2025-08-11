import java.io.File;
import java.io.FileNotFoundException;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Parktikum11_3 {
    private Scanner input;

    public void bukafile(){
         try {
            input = new Scanner (new File("cobadata.txt"));
        }catch(FileNotFoundException e) {
            System.out.println("error membuka file ");
            System.exit(1);
        }
        }

        public void membacadata(){
            try {
                while (input.hasNext()) {
                    int no = input.nextInt();
                    String nama = input.next();
                    double dana = input.nextDouble();

                    System.out.printf("%d %s %.2f\n", no, nama, dana);
                }
            } catch (NoSuchElementException elementException) {
                        System.err.println("Format file salah");
                        input.close();
                        System.exit(1);

            }catch (IllegalStateException illegalStateException){
                System.err.println("error dalam membaca file");
                System.exit(1);
            }
        }

    
        public void menutupfile(){
            if (input != null){
                input.close();
            }
        }

    public static void main(String[] args) {
        Parktikum11_3 myApp = new Parktikum11_3();

        myApp.bukafile();
        myApp.membacadata();
        myApp.menutupfile();
    }
}

