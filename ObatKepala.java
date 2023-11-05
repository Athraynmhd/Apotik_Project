class ObatKepala extends Obat {
    private double harga;

    public ObatKepala(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk meredakan sakit kepala.", stadium);
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    
