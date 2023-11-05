class ObatLukaLuar extends Obat {
    public ObatLukaLuar(int stadium, String namaObat) {
        super(namaObat, stadium);
    }

    @Override
    public String dosis() {
        // Implementasi khusus untuk dosis obat luka luar
        return "Dosis obat luka luar: //dosis berdasarkan stadium , kalo ringan sesuaikan aja biar ga meninggoy";
    }
}
