class Kendaraan {
    // Atribut merek
    protected String merek = "Ford"; 
    public void klakson() {
      System.out.println("Tut, tut!");
    }
  }
  
  class Mobil extends Kendaraan {
    private String model = "Mustang"; 
    public static void main(String[] args) {
      Mobil myCar = new Mobil();
      myCar.klakson();
      System.out.println(myCar.merek + " " + myCar.model);
    }
    public void ngebut() {
      System.out.println("Ngebut!");
    }
    public void klakson() {
      System.out.println("Ngiiing!");
    }
  }
/**
 * InnerMobil
 */
public class InnerMobil {
  public static void main(String[] args) {
    Mobil mobil1 = new Mobil();
    mobil1.klakson();

    Kendaraan mobilKendaraan = new Mobil();
    mobilKendaraan.klakson();

    ((Mobil) mobilKendaraan).ngebut();
  }
}

