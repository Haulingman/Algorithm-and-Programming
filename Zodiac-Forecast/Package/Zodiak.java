package Package;

public class Zodiak {
    String Nama = " ";
    String Periode = " ";
    String Karakter = " ";
    String Elemen = " ";
    String Hewan = " ";

    Zodiak(String inputNama, String inputPeriode, String inputKarakter, String inputElemen, String inputHewan){
        this.Nama= inputNama;
        this.Periode = inputPeriode;
        this.Karakter = inputKarakter;
        this.Elemen = inputElemen;
        this.Hewan = inputHewan;
        
    }
    public String getNama() {
        return Nama;
    }

    public String getPeriode() {
        return Periode;
    }

    public String getKarakter() {
        return Karakter;
    }

    public String getElemen() {
        return Elemen;
    }
    public String getHewan(){
        return Hewan;
    }
}
    


