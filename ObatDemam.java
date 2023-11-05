class ObatDemam extends Obat {
    private double harga;

   public ObatDemam(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk menurunkan demam.", stadium);
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }


    
