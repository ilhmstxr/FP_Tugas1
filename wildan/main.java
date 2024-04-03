package wildan;

import java.util.Scanner;
import javax.swing.JFrame;

public class main {

    static cProduk[] produk = new cProduk[10];
    static int idxPrd = 0;
    static int i = 0;

    public static void main(String[] args) {
        // TAMBAHAN E NAK KENE COK
        // cProduk produk[] = new cProduk[10];
        produk[idxPrd++] = new cProduk("Roti Tawar", 5000, 10);
        produk[idxPrd++] = new cProduk("Roti manis", 7000, 15);
        produk[idxPrd++] = new cProduk("Roti Keju", 8000, 20);
        // cPembeli pembeli1 = new cPembeli();
        Scanner s = new Scanner(System.in);
        int pilih = 0;
        boolean kembali;
        System.out.println("============================================");
        System.out.println("        SELAMAT DATANG DI KAMPOENG ROTI     ");
        System.out.println("Jl. Soka No.21B, Tambaksari, Kec. Tambaksari");
        System.out.println("          Surabaya, Jawa Timur 60136        ");
        System.out.println("============================================");
        do {
            kembali = false;
            System.out.println("");
            System.out.println("-----MENU APP-----");
            System.out.println("| 1. Admin       |");
            System.out.println("| 2. Transaksi   |");
            System.out.println("| 3. Exit        |");
            System.out.println("==================");
            System.out.print("Pilih       = ");
            pilih = s.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("");
                    System.out.println("------Admin------");
                    System.out.println("| 1. Tambah     |");
                    System.out.println("| 2. Edit       |");
                    System.out.println("| 3. Hapus      |");
                    System.out.println("| 4. Detil      |");
                    System.out.println("| 5. Kembali    |");
                    System.out.println("=================");
                    System.out.print("Pilih        = ");
                    int pilih2 = s.nextInt();
                    switch (pilih2) {
                        // NAMBAH NAK KENE SISAN BLOK
                        case 1:
                            if (idxPrd < produk.length) {
                                System.out.println("Daftar Produk:");
                                for (int j = 0; j < produk.length; j++) {
                                    if (produk[j] != null) {

                                        System.out.println((j + 1) + ". " + produk[j].getNama() + " - Harga: "
                                                + produk[j].getHarga() + " - Stok: " + produk[j].getStok());
                                    } else {
                                        System.out.println("null");
                                    }
                                }
                                System.out.print("Nama produk = ");
                                String nm = s.next();
                                System.out.print("Harga       = ");
                                int harga = s.nextInt();
                                System.out.print("Stok        = ");
                                int stok = s.nextInt();
                                produk[idxPrd++] = new cProduk(nm, harga, stok);
                                System.out.println("Produk berhasil ditambahkan.");
                            } else {
                                System.out.println("Daftar produk sudah penuh.");
                            }
                            break;

                        case 2:
                            System.out.print("Nama produk yang akan diubah = ");
                            String namaProduk = s.next();
                            boolean edit = false;
                            for (int i = 0; i < idxPrd; i++) {
                                if (produk[i].getNama().equalsIgnoreCase(namaProduk)) {
                                    System.out.print("Harga baru = ");
                                    int hargaBaru = s.nextInt();
                                    produk[i].setHarga(hargaBaru);

                                    System.out.print("Stok baru = ");
                                    int stokBaru = s.nextInt();
                                    produk[i].setStok(stokBaru);

                                    edit = true;
                                    System.out.println("=================");
                                    System.out.println("Perubahan berhasil..");
                                    System.out.println("=================");
                                    break;
                                }
                            }
                            if (!edit) {
                                System.out.println("================");
                                System.out.println("Produk tidak ditemukan");
                                System.out.println("================");
                            }
                            break;

                        case 3:
                            System.out.print("Nama         =");
                            String nm = s.next();
                            boolean produkDitemukan = false;
                            for (int i = 0; i < idxPrd; i++) {
                                if (produk[i].getNama().equalsIgnoreCase(nm)) {
                                    produk[i] = null;
                                    produkDitemukan = true;
                                    System.out.println("=================");
                                    System.out.println("Hapus sukses..");
                                    System.out.println("=================");
                                    break;
                                }
                            }
                            if (!produkDitemukan) {
                                System.out.println("================");
                                System.out.println("Produk tidak ada");
                                System.out.println("================");
                            }
                            break;
                        case 4:
                            boolean adaProduk = false;
                            System.out.println("Daftar Produk:");
                            for (int j = 0; j < 10; j++) {
                                if (produk[j] != null) {
                                    System.out.println((j + 1) + ". " + produk[j].getNama() + " - Harga: "
                                            + produk[j].getHarga() + " - Stok: " + produk[j].getStok());
                                } else {
                                    System.out.println("kosong");
                                }
                            }
                            adaProduk = true;
                            if (!adaProduk) {
                                System.out.println("Belum ada barang yang ditambahkan.");
                            }
                    }
                case 5:
                    kembali = true;
                    break;

                case 2:
                    System.out.println("Daftar Roti:");
                    System.out.println("===================================");
                    System.out.println("| No |    Nama Roti    | Harga |");
                    System.out.println("===================================");
                    for (int i = 0; i < produk.length; i++) {
                        if (produk[i] != null) {
                            System.out.printf("| %2d | %-15s | %5d |\n", i + 1, produk[i].getNama(),
                                    produk[i].getHarga());
                        }
                    }
                    System.out.println("===================================");

                    // Memulai pembelian
                    System.out.print("Pilih nomor roti yang ingin dibeli, Ketuk 0 untuk melanjutkan : ");
                    int nomorRoti = s.nextInt();
                    while (nomorRoti != 0) {
                        if (nomorRoti > 0 && nomorRoti <= produk.length && produk[nomorRoti - 1] != null) {
                            System.out.print("Jumlah roti yang ingin dibeli: ");
                            int jumlahBeli = s.nextInt();
                            if (produk[nomorRoti - 1].getStok() >= jumlahBeli) {
                                // Kurangi stok roti yang dibeli
                                produk[nomorRoti - 1].setStok(produk[nomorRoti - 1].getStok() - jumlahBeli);
                                System.out.println("\n================================");
                                System.out.println(produk[nomorRoti - 1].getNama() + " (x" + jumlahBeli
                                        + ") dimasukkan ke keranjang.");
                                System.out.println("================================\n");
                            } else {
                                System.out.println("Maaf, stok roti tidak mencukupi.");
                            }
                        } else {
                            System.out.println("Nomor roti tidak valid atau roti tidak tersedia.");
                        }
                        // Tampilkan kembali daftar roti
                        System.out.println("Daftar Roti:");
                        System.out.println("===================================");
                        System.out.println("| No |    Nama Roti    | Harga |");
                        System.out.println("===================================");
                        for (int i = 0; i < produk.length; i++) {
                            if (produk[i] != null) {
                                System.out.printf("| %2d | %-15s | %5d |\n", i + 1, produk[i].getNama(),
                                        produk[i].getHarga());
                            }
                        }
                        System.out.println("===================================");
                        System.out.print("Pilih nomor roti yang ingin dibeli (tekan 0 untuk keluar): ");
                        nomorRoti = s.nextInt();
                    }
                    System.out.println("Terima kasih!");
                    System.out.println("--Transaksi--");
                    System.out.println("1. Tambah    ");
                    System.out.println("2. Hapus     ");
                    System.out.println("3. Check Out ");
                    System.out.println("=============");
                    System.out.print("Pilih = ");
                    System.out.print("Pilih = ");
                    int switchpembeli = s.nextInt();
                    switch (switchpembeli) {
                        case 1:

                        case 2:
                            break;

                        case 3:
                            break;

                    }
                case 3:
                    break;
            }
        } while (pilih != 3);
    }
}