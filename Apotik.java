import java.text.DecimalFormat; // digunakan untuk mengubah format angka menjadi tampilan yang lebih terstruktur dan mudah dibaca
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apotik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kasir kasir = new Kasir();
        String namaPelanggan;
        boolean adaKeluhanLain;

        System.out.println("Selamat Datang di Apotik");
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

            System.out.println("Masukkan tingkat kesakitan anda :");
            System.out.println("1. Sakitnya ringan gosah banya li tingkah lah");
            System.out.println("2. sakit Butuh penanganan lebih lanjut");
            System.out.println("3. omak hamper meninggoy bro");
            int sakit = Integer.parseInt(scanner.nextLine());
