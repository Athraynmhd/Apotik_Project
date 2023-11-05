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

 