import java.util.*;

public class Praktikum7_1 {
    public static void main(String[] args) {
        String [] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        List<String> days2 = new ArrayList<String>();
        days2.add("Senin");
        days2.add("Selasa");
        days2.add("Rabu");
        days2.add("Kamis");
        days2.add("Jumat");
        days2.add("Saturday");
        days2.add("Minggu");
        
        System.out.println("Menggunakan Array: ");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days [i]+" ");
        }
        System.out.println("");
        System.out.println("====================");
        System.out.println("Menggunakan List / Array List: ");
        System.out.println(days2);
    }
}

