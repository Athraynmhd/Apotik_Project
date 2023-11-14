import java.text.DecimalFormat; // digunakan untuk mengubah format angka menjadi tampilan yang lebih terstruktur dan mudah dibaca
import java.util.ArrayList;  // Import kelas ArrayList dari paket java.util
import java.util.List;       // Import kelas List dari paket java.util
import java.util.Scanner;    // Import kelas Scanner dari paket java.util

public class Apotik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataKasir kasir = new DataKasir();
        String namaPelanggan;
        boolean adaKeluhanLain;
        
        
        System.out.println("Selamat Datang di Apotik");
        
        do{
            System.out.print("Masukkan Id_Kasir: ");
            String ID = scanner.nextLine();
            kasir.setIdKasir(ID);
        }while(kasir.NamaKasir == null);
        kasir.printNK();
                
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

            if (jenis == 0) {
                break;
            }

            System.out.println("Masukkan stadium sakit:");
            System.out.println("1. Stadium 1 (Sakit yang masih ringan, disarankan minum air hangat dan istirahat)");
            System.out.println("2. Stadium 2 (Sakit yang sedang, memerlukan penanganan lebih lanjut)");
            System.out.println("3. Stadium 3 (Sakit yang berat, dosis obat yang lebih tinggi diperlukan)");
            int stadium = Integer.parseInt(scanner.nextLine());

            if (stadium == 1) {
                System.out.println("Untuk stadium 1, tidak ada obat yang diperlukan. Disarankan minum air hangat dan cukup istirahat.");
            } else {
                String[] opsiObat = getOpsiObat(jenis, stadium);
                System.out.println("Pilih obat:");
                for (int i = 0; i < opsiObat.length; i++) {
                    System.out.println((i + 1) + ". " + opsiObat[i]);
                }
                int pilihanObat = Integer.parseInt(scanner.nextLine());
                String obatTerpilih = opsiObat[pilihanObat - 1];

                double hargaObat = getHargaObat(jenis, stadium, obatTerpilih);
                kasir.tambahObat(buatObat(jenis, stadium, obatTerpilih, hargaObat));
            }

            System.out.print("Apakah ada keluhan lain? (ya/tidak): ");
            adaKeluhanLain = scanner.nextLine().equalsIgnoreCase("ya");
        } while (adaKeluhanLain);

        if (!kasir.isKosong()) {
            kasir.cetakStruk(namaPelanggan);
        }

        scanner.close();
        System.out.println("Cepet Sembuh yaa, " + namaPelanggan + "!");
    }

    private static String[] getOpsiObat(int jenis, int stadium) {
        switch (jenis) {
            case 1: // Sakit Kepala
                return stadium == 2 ? new String[]{"Panadol Extra", "Bodrex Extra", "Ibuprofen Paracetamol"}
                        : new String[]{"Paracetamol", "Ibuprofen", "Aspirin", "Naproxen"};
            case 2: // Demam
                return stadium == 2 ? new String[]{"Paracetamol", "Ibuprofen", "Naproxen"}
                        : new String[]{"Aspirin", "Acetaminophen"};
            case 3: // Luka Luar
                return stadium == 2 ? new String[]{"Antiseptik", "Salep Antibiotik", "Salep Antiinflamasi"}
                        : new String[]{"Antiseptik Kuat", "Salep Antibiotik Berkekuatan Tinggi"};
            case 4: // Luka Dalam
                return stadium == 2 ? new String[]{"Antibiotik Oral", "Pain Reliever"}
                        : new String[]{"Antibiotik Spektrum Luas", "Pain Reliever Kuat"};
            case 5: // Sakit Hati
                return stadium == 2 ? new String[]{"Obat Antistres Ringan", "Obat Penenang"}
                        : new String[]{"Obat Antistres Kuat", "Obat Penenang Kuat"};
            default:
                return new String[]{};
        }
    }

    private static double getHargaObat(int jenis, int stadium, String namaObat) {
        double harga = 0;

        if (namaObat.equalsIgnoreCase("Panadol Extra")) {
            harga = 15000.0;
        } else if (namaObat.equalsIgnoreCase("Bodrex Extra")) {
            harga = 12000.0;
        } else if (namaObat.equalsIgnoreCase("Ibuprofen Paracetamol")) {
            harga = 10000.0;
        } else if (namaObat.equalsIgnoreCase("Paracetamol")) {
            harga = 12000.0;
        } else if (namaObat.equalsIgnoreCase("Ibuprofen")) {
            harga = 13000.0;
        } else if (namaObat.equalsIgnoreCase("Aspirin")) {
            harga = 11000.0;
        } else if (namaObat.equalsIgnoreCase("Naproxen")) {
            harga = 14000.0;
        } else if (namaObat.equalsIgnoreCase("Aspirin")) {
            harga = 11000.0;
        } else if (namaObat.equalsIgnoreCase("Acetaminophen")) {
            harga = 10000.0;
        } else if (namaObat.equalsIgnoreCase("Antiseptik")) {
            harga = 8000.0;
        } else if (namaObat.equalsIgnoreCase("Salep Antibiotik")) {
            harga = 10000.0;
        } else if (namaObat.equalsIgnoreCase("Salep Antiinflamasi")) {
            harga = 9000.0;
        } else if (namaObat.equalsIgnoreCase("Antiseptik Kuat")) {
            harga = 12000.0;
        } else if (namaObat.equalsIgnoreCase("Salep Antibiotik Berkekuatan Tinggi")) {
            harga = 15000.0;
        } else if (namaObat.equalsIgnoreCase("Antibiotik Oral")) {
            harga = 11000.0;
        } else if (namaObat.equalsIgnoreCase("Pain Reliever")) {
            harga = 10000.0;
        } else if (namaObat.equalsIgnoreCase("Antibiotik Spektrum Luas")) {
            harga = 12000.0;
        } else if (namaObat.equalsIgnoreCase("Pain Reliever Kuat")) {
            harga = 15000.0;
        } else if (namaObat.equalsIgnoreCase("Obat Antistres Ringan")) {
            harga = 9000.0;
        } else if (namaObat.equalsIgnoreCase("Obat Penenang")) {
            harga = 8000.0;
        } else if (namaObat.equalsIgnoreCase("Obat Antistres Kuat")) {
            harga = 12000.0;
        } else if (namaObat.equalsIgnoreCase("Obat Penenang Kuat")) {
            harga = 11000.0;
        }

        return harga;
    }

    private static Obat buatObat(int jenis, int stadium, String namaObat, double harga) {
        switch (jenis) {
            case 1: // Sakit Kepala
                return new ObatKepala(stadium, namaObat, harga);
            case 2: // Demam
                return new ObatDemam(stadium, namaObat, harga);
            case 3: // Luka Luar
                return new ObatLukaLuar(stadium, namaObat, harga);
            case 4: // Luka Dalam
                return new ObatLukaDalam(stadium, namaObat, harga);
            case 5: // Sakit Hati
                return new ObatSakitHati(stadium, namaObat, harga);
            default:
                return null;
        }
    }
}
