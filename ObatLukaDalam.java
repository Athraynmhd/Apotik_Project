class ObatLukaDalam extends Obat {
     private double harga;
     
    public ObatLukaDalam(int stadium, String namaObat, double harga) {
        super(namaObat, "Obat ini digunakan untuk merawat luka dalam.", stadium);
        this.harga = harga;
    }
    
    public double getHarga() {
        return harga;
    }

    @Override
    public String dosis() {
        switch (stadium) {
            case 1: 
                return "Dosis ringan: 1 tablet setiap 12 jam."; // Luka dalam kalo ga make sense dalam bentuk tablet, bisa ganti dengan obat kumur, let's say 1 kali kumur
            case 2: 
                return "Dosis sedang: 1 tablet setiap 8 jam.";
            case 3: 
                return "Dosis berat: 1 tablet setiap 4 jam.";
            default: 
                return "Stadium tidak dikenal.";
        }
    }
}
