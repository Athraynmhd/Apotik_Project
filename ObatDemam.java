class ObatDemam extends Obat {
    public ObatDemam(int stadium, String namaObat) {
        super(namaObat, "Obat ini digunakan untuk menurunkan demam.", stadium);
    }

    public double getHarga() {
        return harga;
    }

     @Override
    public String dosis() {
        return "Dosis obat demam: [Detail dosis berdasarkan stadium]"; // ada 3 sstadium atau 3 fase nanti
    }
}
