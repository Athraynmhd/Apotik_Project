import java.text.DecimalFormat; // digunakan untuk mengubah format angka menjadi tampilan yang lebih terstruktur dan mudah dibaca
import java.util.ArrayList;  // Import kelas ArrayList dari paket java.util
import java.util.List;       // Import kelas List dari paket java.util
import java.util.Scanner;    // Import kelas Scanner dari paket java.util

public class Apotik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kasir kasir = new Kasir();
        String namaPelanggan;
        boolean adaKeluhanLain;

        System.out.println("Selamat Datang di Apotik");

        do{
            System.out.print("Masukkan Id_Kasir: ");
            String ID = scanner.nextLine();
            kasir.setIdKasir(ID);
        }while(kasir.NamaKasir == null);
        
        System.out.print("Masukkan nama Anda: ");
        namaPelanggan = scanner.nextLine();

        do {
            System.out.println("Pilih jenis sakit:");
            System.out.println("1. Sakit Kepala");
            System.out.println("2. Demam");
            System.out.println("3. Luka Luar");
            System.out.println("4. Luka Dalam");
            System.out.println("5. Sakit Hati");
            System.out.println("0. Selesai dan cetak struk");

            int jenis = Integer.parseInt(scanner.nextLine());

           f (jenis == 0) {
                break;
            } 

            System.out.println("Masukkan stadium sakit:");
            System.out.println("1. Stadium 1 (Sakit yang masih ringan, disarankan minum air hangat dan istirahat)");
            System.out.println("2. Stadium 2 (Sakit yang sedang, memerlukan penanganan lebih lanjut)");
            System.out.println("3. Stadium 3 (Sakit yang berat, dosis obat yang lebih tinggi diperlukan)");
            int stadium = Integer.parseInt(scanner.nextLine());

             if(stadium == 1) {
                System.out.println("Untuk stadium 1, tidak ada obat yang diperlukan. Disarankan minum air hangat dan cukup istirahat."); //samain aja untuk semua sakit kalo stadium 1
            } else {
                String[] opsiObat = getOpsiObat(jenis, stadium);
                System.out.println("Pilih obat:");
                for (int i = 0; i < opsiObat.length; i++) {
                    System.out.println((i + 1) + ". " + opsiObat[i]);
                }
                int pilihanObat = Integer.parseInt(scanner.nextLine());
                String obatTerpilih = opsiObat[pilihanObat - 1];

                kasir.tambahObat(buatObat(jenis, stadium, obatTerpilih));
            }
                
