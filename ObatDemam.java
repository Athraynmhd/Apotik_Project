class ObatDemam extends Obat {
    private double harga;

    public ObatDemam(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk menurunkan demam.", stadium); 
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String dosis() {
        switch (stadium) {
            case 1:
                return "Dosis ringan: 1 tablet setiap 12 jam.";
            case 2:
                return "Dosis sedang: 1 tablet setiap 8 jam.";
            case 3:
                return "Dosis berat: 1 tablet setiap 4 jam.";
            default:
                return "Stadium tidak dikenal.";
        }
    }
}
