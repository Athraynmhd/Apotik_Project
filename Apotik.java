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
