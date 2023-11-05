class ObatLukaDalam extends Obat {
     private double harga;
     
    public ObatLukaDalam(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk merawat luka luar.", stadium);
        this.harga = harga;
    }
