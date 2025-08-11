package Package;

public class Ramalan {
    private String nama;
    private String elemen;
    private String hewan;
    private String ramalan;
    private int rating;

    public Ramalan(String nama, String elemen, String hewan, String ramalan, int rating) {
        this.nama = nama;
        this.elemen = elemen;
        this.hewan = hewan;
        this.ramalan = ramalan;
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public String getElemen() {
        return elemen;
    }

    public String getHewan() {
        return hewan;
    }

    public String getRamalan() {
        return ramalan;
    }

    public int getRating() {
        return rating;
    }
}
