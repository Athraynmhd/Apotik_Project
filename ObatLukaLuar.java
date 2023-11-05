class ObatLukaLuar extends Obat {
     private double harga;
     
  public ObatLukaLuar(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk merawat luka luar.", stadium);
        this.harga = harga;
    } 

  public double getHarga() {
        return harga;
    }

  @Override
    public String dosis() {
        switch (stadium) {
            case 1: 
                return "Cuma Solat obatnya.";

         yaudah solat broo
