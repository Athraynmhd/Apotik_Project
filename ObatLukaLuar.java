class ObatLukaLuar extends Obat {
     private double harga;
     
  ObatLukaLuar(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk merawat luka luar.", stadium);
        this.harga = harga;
    }
