class ObatKepala extends Obat {
    public ObatKepala(int stadium, String namaObat) {
        super(namaObat, "Obat ini digunakan untuk meredakan sakit kepala.", stadium);
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
