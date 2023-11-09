import java.text.DecimalFormat; // digunakan untuk mengubah format angka menjadi tampilan yang lebih terstruktur dan mudah dibaca
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Kasir {
    private List<Obat> obatTerpilih;

    public Kasir() {
        obatTerpilih = new ArrayList<>();
    }

    public void tambahObat(Obat obat) {
        obatTerpilih.add(obat);
    }

    public boolean isKosong() {
        return obatTerpilih.isEmpty();
    }

    public void cetakStruk(String namaPelanggan) {
        double totalHarga = 0;
        String leftAlignFormat = "| %-20s | %-8d | %-12s | %-40s | %-20s | %-15s |%n"; // Sesuaiin aja Sama hasil output, kalo kurang set ulang ya
        
        System.out.println("\nStruk Pembelian Obat:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Date: " + now.format(formatter));
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
        System.out.format("| Sakit                | Stadium  | Jumlah Obat  | Dosis                                    | Nama Obat               | Harga            |%n");
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
        
    for (Obat obat : obatTerpilih) {
        if (obat != null) {
            String jenisSakit = extractSakitFromNamaObat(obat.getNama());
            System.out.format(leftAlignFormat, jenisSakit, obat.getStadium(), "1", obat.dosis(), obat.getNama(), formatHarga(obat.getHarga()));
            totalHarga += obat.getHarga();
        } else {
            System.out.println("Ada obat yang tidak teridentifikasi.");
        }
    }

    System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
    DecimalFormat decimalFormat = new DecimalFormat("Rp #,###,###.###");
    System.out.println("Total Harga: " + decimalFormat.format(totalHarga));
