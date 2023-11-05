class ObatSakitHati extends Obat {
    public ObatSakitHati(int stadium, String namaObat) {
        super(namaObat, "Obat ini digunakan untuk meredakan sakit hati dan stres.", stadium);
    }
     @Override
    public String dosis() {
        return "Dosis obat sakit hati: [Detail dosis berdasarkan stadium]"; // tapi tergantung pemabagian di apotik
    }
}
