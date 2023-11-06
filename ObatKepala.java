class ObatKepala extends Obat {
    private double harga;

    public ObatKepala(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk meredakan sakit kepala.", stadium);
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String dosis() {
        switch (stadium) {
            case 1:
                return "Dosis ringan: 1 tablet setiap 6 jam.";
            case 2:
                return "Dosis sedang: 1 tablet setiap 4 jam.";
            case 3:
                return "Dosis berat: 2 tablet setiap 4 jam.";
            default:
                return "Stadium tidak dikenal. Silakan konsultasi dengan dokter.";
        }
    }
}

