package App;

import java.util.Scanner;
import java.time.*;

class appKasir {
    // public static void main(String[] args) {
    // cProduk p = new cProduk();
    // Scanner sc = new Scanner(System.in);
    // p = new cProduk("Kanzler", 53, 42000);
    // int pilihMenu = 0, konfirmasi;

    // do {
    // System.out.println("| FROZEN FOOD KULBET |");
    // System.out.println("|---------------------|");
    // System.out.println("Pilih Menu");
    // System.out.println("1. Produk");
    // System.out.println("2. Pembeli");
    // System.out.println("3. Transaksi");
    // System.out.println("4. Exit");
    // System.out.print("Pilih = ");
    // pilihMenu = sc.nextInt();
    // System.out.println("|---------------------|\n");
    // switch (pilihMenu) {
    // // Menu Produk
    // case 1:
    // int menuProduk = 0;
    // do {

    // System.out.println(" [Menu Produk]");
    // System.out.println(" 1. Tambah Produk");
    // System.out.println(" 2. Ubah Produk");
    // System.out.println(" 3. Hapus Produk");
    // System.out.println(" 4. Detil Produk");
    // System.out.println(" 5. Exit");
    // System.out.print(" Pilih Menu (Angka) = ");
    // menuProduk = sc.nextInt();
    // System.out.println("|---------------------|\n");
    // switch (menuProduk) {
    // case 1:
    // // Menu Tambah Produk
    // System.out.println(" [Menu Tambah Produk]");
    // sc = new Scanner(System.in);
    // System.out.print(" Nama Produk: ");
    // String namaBaru = sc.nextLine();
    // System.out.print(" Harga Produk: ");
    // int hargaBaru = sc.nextInt();
    // System.out.print(" Stok Produk: ");
    // int stokBaru = sc.nextInt();
    // p = new cProduk(namaBaru, stokBaru, hargaBaru);
    // System.out.println("|---------------------|\n");
    // break;
    // case 2:
    // // Menu Edit Produk
    // System.out.println(" 1. Ubah Stok Produk");
    // System.out.println(" 2. Ubah Harga Produk");
    // System.out.print(" Pilih (1/2) = ");
    // int ubahProduk = sc.nextInt();
    // // mengecek pilihan produk yang akan dirubah
    // if (ubahProduk == 1) {
    // System.out.print(" Stok Baru = ");
    // stokBaru = sc.nextInt();
    // // Konfirmasi
    // System.out.println(" Apakah Yakin?");
    // System.out.println(" 1. Ya");
    // System.out.println(" 2. Tidak");
    // System.out.print("Pilih (1/2) = ");
    // konfirmasi = sc.nextInt();
    // if (konfirmasi == 1) {
    // p.setStokProduk(stokBaru);
    // System.out.println(" Stok Berhasil Dirubah");
    // } else {
    // System.out.println(" Stok Gagal Dirubah");
    // }
    // } else {
    // System.out.print(" Harga Baru = ");
    // hargaBaru = sc.nextInt();
    // // Konfirmasi
    // System.out.println( "Apakah Yakin?");
    // System.out.println( "1. Ya");
    // System.out.println( "2. Tidak");
    // System.out.print( "Pilih (1/2) = ");
    // konfirmasi = sc.nextInt();
    // if (konfirmasi == 1) {
    // p.setHargaProduk(hargaBaru);
    // System.out.println(" Harga Berhasil Dirubah");
    // } else {
    // System.out.println(" Harga Gagal Dirubah");
    // }
    // }
    // System.out.println("|---------------------|\n");
    // break;
    // case 3:
    // // Menu Hapus Produk
    // System.out.print(" Nama Produk = ");
    // sc = new Scanner(System.in);
    // String nama = sc.nextLine();
    // // hapus produk
    // System.out.println( "Apakah Yakin?");
    // System.out.println( "1. Ya");
    // System.out.println( "2. Tidak");
    // System.out.print( "Pilih (1/2) = ");
    // konfirmasi = sc.nextInt();
    // if (nama.equalsIgnoreCase(p.getNamaProduk())) {
    // if (konfirmasi == 1) {
    // p = null;
    // System.out.println("Produk Berhasil Dihapus");
    // } else {
    // System.out.println("Produk Gagal Dihapus");
    // }
    // } else {
    // System.out.println("Produk Tidak Ada");
    // }
    // System.out.println("|---------------------|\n");
    // break;
    // case 4:
    // // Menu Detail Produk
    // if (p != null) {
    // System.out.println(p.ubahMenjadiKalimat());
    // } else {
    // System.out.println("Produk Tidak Ada");
    // }
    // System.out.println("|---------------------|\n");
    // break;
    // }

    // } while (menuProduk != 5);
    // break;
    // // Menu Pembeli
    // case 2:

    // break;
    // // Menu Transaksi
    // case 3:

    // break;

    // }
    // } while (pilihMenu != 4);

    // // objek pertama produk

    // }
    public static void main(String[] args) {
        // bikin ulang
        Scanner sc = new Scanner(System.in);

        String pembatasG = "--------------------";
        String pembatasSD = "====================";
        String salahPilih = "Pilihan Tidak ada !\nSilahkan pilih ulang";
        int menu, pilih;

        int count = 1;

        LocalDateTime date = LocalDateTime.now();
        int tanggal = date.getDayOfMonth();
        int bulan = date.getMonthValue();
        int tahun = date.getYear();
        int jam = date.getHour();
        int menit = date.getMinute();
        String strBulan = String.format("%02d", bulan);
        String strCount = String.format("%03d", count);
        System.out.println(tanggal + "" + strBulan + "" + strCount);
        System.exit(0);

        // Menu Utama

        do {
            System.out.println(pembatasG);
            System.out.println("   FROZEN FOOD KULBET");
            System.out.println(" 1. Produk");
            // System.out.println(" 2. Member");
            System.out.println(" 2. Transaksi");
            System.out.println(" 3. Transaksi Admin");
            System.out.println(" 4. Daftar Member");
            System.out.println(" 5. Selesai");
            System.out.println(pembatasSD);
            System.out.print(" Pilih: ");
            menu = sc.nextInt();
            System.out.println(pembatasG);

            // ketika menu angka 5 terpilih
            if (menu == 5) {
                System.out.println("Terima Kasih !!!");
            }
            // ketika menu angka lebih dari 4. atau kurang dari 0 terpilih
            else if (menu > 5 || menu <= 0) {
                System.out.println(salahPilih);
            }
            // ketika tidak ada menu diatas bernilai benar maka
            else {
                switch (menu) {
                    // Produk
                    case 1:
                        do {
                            // menu produk
                            System.out.println(pembatasSD);
                            System.out.println("[Produk]");
                            System.out.println(" 1. Tambah");
                            System.out.println(" 2. Ubah");
                            System.out.println(" 3. Hapus");
                            System.out.println(" 4. Detil");
                            System.out.println(" 5. Selesai");
                            System.out.println(pembatasG);

                            // input dari user
                            System.out.print("Pilih: ");
                            pilih = sc.nextInt();

                            System.out.println(pembatasSD);
                            switch (pilih) {
                                // Tambah produk. menambah data produk, data tsb adalah kode, nama, harga, stok,
                                // tanggal ditambahkan
                                case 1:
                                    System.out.println("tambah produk");
                                    break;
                                // Ubah produk. mengubah data produk, data yang dapat dirubah adalah nama,
                                // harga, stok. serta tanggal dirubah
                                case 2:
                                    System.out.println("ubah produk");
                                    break;
                                // hapus produk. menghapus data produk dengan mengetikkan nama produk yang akan
                                // dihapus
                                case 3:
                                    System.out.println("hapus produk");
                                    break;
                                // detil produk. menampilkan data produk
                                case 4:
                                    System.out.println("detil produk");
                                    break;
                                // selesai
                                case 5:
                                    System.out.println("kembali ke menu utama!");
                                    break;
                            }

                            // pemberitahuan bahwa salah pilih
                            if (pilih > 5 || pilih <= 0) {
                                System.out.println(salahPilih);
                            }
                        } while (pilih != 5);
                        break;

                    // Transaksi
                    // Membuat CRUD, konfirmasi, status
                    case 2:
                        do {
                            // menu transaksi konsumen
                            System.out.println(pembatasSD);
                            System.out.println("[Transaksi]");
                            System.out.println(" 1. Tambah");
                            System.out.println(" 2. Ubah");
                            System.out.println(" 3. Hapus");
                            System.out.println(" 4. Cetak");
                            System.out.println(" 5. Bayar");
                            System.out.println(" 6. Kembali ke menu utama");
                            System.out.println(" 7. Exit");
                            System.out.println(pembatasG);

                            // input menu dari user
                            System.out.print("Pilih: ");
                            pilih = sc.nextInt();

                            System.out.println(pembatasSD);

                            pilih = sc.nextInt();
                            switch (pilih) {
                                // menambah produk kedalam keranjang
                                case 1:
                                    System.out.println("tambah produk ke keranjang");
                                    break;
                                // mengubah jumlah produk yang berada di keranjang (qty)
                                case 2:
                                    System.out.println("ubah produk di keranjang");
                                    break;
                                // menghapus produk yang berada di keranjang
                                case 3:
                                    System.out.println("hapus produk di keranjang");
                                    break;

                                // cetak struk sementara untuk melihat total
                                case 4:
                                    System.out.println("cetak struk");
                                    break;

                                // pembayaran serta struk output
                                case 5:
                                    System.out.println("pembayaran");
                                    break;

                                case 6:
                                    System.out.println("kembali ke menu utama!");
                                    break;
                                case 7:
                                    System.out.println("Terima Kasih !!!");
                                    System.exit(0);

                            }

                            // pemberitahuan bahwa salah pilih
                            if (pilih > 7 || pilih <= 0) {
                                System.out.println(salahPilih);
                            }

                        } while (pilih != 6);
                        break;

                    // Transaksi Admin
                    case 3:
                        do {
                            // menu transaksi admin
                            System.out.println(pembatasSD);
                            System.out.println("[Transaksi Admin]");
                            System.out.println(" 1. Cek Transaksi");
                            System.out.println(" 2. Histori Transaksi");
                            System.out.println(" 3. Kembali ke menu utama");
                            System.out.println(" 4. Exit");
                            System.out.println(pembatasG);

                            // input dari admin
                            System.out.print("Pilih: ");
                            pilih = sc.nextInt();

                            System.out.println(pembatasSD);
                            pilih = sc.nextInt();
                            switch (pilih) {
                                // mengecek status transaksi apakah sudah dibayar ataukah belum dengan melihat
                                // kode transaksi
                                case 1:
                                    System.out.println("cek status transaksi");
                                    break;

                                // Histori Transaksi
                                // mengecek histori sebuah transaksi
                                // kapan dan siapa yang telah bertransaski
                                // detail produk yang dibeli(?)
                                case 2:
                                    System.out.println(" histori transaksi");
                                    break;
                                case 3:
                                    System.out.println("Kembali ke Menu Utama");
                                    break;
                                case 4:
                                    System.out.println("Terima Kasih !!!");
                                    System.exit(0);
                            }

                            // pemberitahuan bahwa salah pilih
                            if (pilih > 4 || pilih <= 0) {
                                System.out.println(salahPilih);
                            }
                        } while (menu != 4);
                        break;

                    // Pengelolaan member
                    case 4:
                        do {
                            // menu member
                            System.out.println(pembatasSD);
                            System.out.println("1. Daftar Member");
                            System.out.println("2. Registrasi Member");
                            System.out.println("3. Kembali ke menu utama");
                            System.out.println("4. Exit");
                            System.out.println(pembatasG);

                            // input menu member
                            System.out.println("Pilih: ");
                            pilih = sc.nextInt();

                            System.out.println(pembatasSD);
                            switch (pilih) {
                                case 1:
                                    System.out.println("Daftar member");
                                    break;

                                case 2:
                                    System.out.println("Registrasi member");
                                    break;
                                case 3:
                                    System.out.println("kembali ke menu utama");
                                    break;
                                case 4:
                                    System.out.println("Terima Kasih !!!");
                                    System.exit(0);
                            }

                            if (pilih > 4 || pilih <= 0) {
                                System.out.println(salahPilih);
                            }
                        } while (menu != 3);
                        break;
                    case 5:
                        System.out.println("Terima Kasih !!!");
                        break;

                }
            }
        } while (menu != 5);
    }
}
