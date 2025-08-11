import java.io.File;


public class Praktikum11_1 {

    public static void observasifile (String alamatfile) {
        File fileDicari = new File(alamatfile);
        if(fileDicari.exists()){
            System.out.printf("%s %s\n ", alamatfile, ", ada");
            boolean apakahfile = fileDicari.isFile();
            if (apakahfile=true) {
                System.out.printf("%s %s\n", alamatfile,"Adalah file");
            } else {
                System.out.printf("%s %s\n", alamatfile,"Bukan file");
            }
            boolean apakahdirektori = fileDicari.isDirectory();
            if (apakahdirektori=true) {
                System.out.printf("%s %s\n", alamatfile,"Adalah direktori");
                String[] arrdir =  fileDicari.list();
                System.out.println("ISI :");
                for ( int index=0; index<arrdir.length; index++ ){
                    System.out.println("\t"+arrdir[index]);
                }


            }
        }
    }
}