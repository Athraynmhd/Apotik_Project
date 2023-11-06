class ObatSakitHati extends Obat {
     private double harga;
     
    public ObatSakitHati(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk meredakan sakit hati dan stress.", stadium);
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }
    
    @Override
    public String dosis() {
        switch (stadium) {
            case 1: 
                return "Dosis ringan: 1 tablet saat merasa sakit hati.";
            case 2: 
                return "Dosis sedang: 2 tablet saat merasa sakit hati.";
            case 3: 
                return "Dosis berat: 3 tablet saat merasa sakit hati.";
            default: 
                return "Stadium tidak dikenal.";
        }
    }
}
