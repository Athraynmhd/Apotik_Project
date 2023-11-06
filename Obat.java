public abstract class Obat {
    protected String nama;
    protected String deskripsi;
    protected int stadium;
    private double harga;

    public Obat(String nama, String deskripsi, int stadium) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.stadium = stadium;
    }    

     public double getHarga() {
        return harga;
    } 
    
    public String getNama() {
        return nama;
    }

    public int getStadium() {
        return stadium;
    }

    public abstract String dosis();
}
