class ObatLukaLuar extends Obat {
    public ObatLukaLuar(int stadium, String namaObat) {
        super(namaObat, stadium);
    }
/**
  public double getHarga() {
        return harga;
    } */

  @Override
    public String dosis() {
        switch (stadium) {
            case 1: 
                return "Dosis ringan: Oleskan pada luka sekali sehari.";
            case 2: 
                return "Dosis sedang: Oleskan pada luka dua kali sehari.";
            case 3: 
                return "Dosis berat: Oleskan pada luka tiga kali sehari.";
            default: 
                return "Stadium tidak dikenal.";
        }
    }
}
