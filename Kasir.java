import java.text.DecimalFormat;
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
        
        System.out.println("\nStruk Pembelian Obat:");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
        System.out.format("| Sakit                | Stadium  | Jumlah Obat  | Dosis                                    | Nama Obat               | Harga            |%n");
        System.out.format("+----------------------+----------+--------------+------------------------------------------+-------------------------+------------------+%n");
