import java.text.DecimalFormat; // digunakan untuk mengubah format angka menjadi tampilan yang lebih terstruktur dan mudah dibaca
import java.util.ArrayList;
import java.util.List;

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
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
        System.out.format("| Sakit                | Stadium  | Jumlah Obat  | Dosis                                    | Nama Obat               | Harga            |%n");
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
