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
