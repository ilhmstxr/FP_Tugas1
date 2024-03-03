package App;

import java.util.Scanner;

class appKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cProduk p = new cProduk();
        p = new cProduk("Kanzler", 53, 42000);
        int pilihMenu = 0, konfirmasi;

        do {
            System.out.println("| FROZEN FOOD KULBET |");
            System.out.println("|---------------------|");
            System.out.println("Pilih Menu");
            System.out.println("1. Produk");
            System.out.println("2. Pembeli");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            pilihMenu = sc.nextInt();
            switch (pilihMenu) {
                // Menu Produk
                case 1:
                    int menuProduk = 0;
                    do {

                        System.out.println("[Menu Produk]");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Ubah Produk");
                        System.out.println("3. Hapus Produk");
                        System.out.println("4. Detil Produk");
                        System.out.println("5. Exit");
                        System.out.print("Pilih Menu (Angka) = ");
                        menuProduk = sc.nextInt();
                        switch (menuProduk) {
                            case 1:
                                // Menu Tambah Produk
                                System.out.println("[Menu Tambah Produk]");
                                sc = new Scanner(System.in);
                                System.out.print(" Nama Produk: ");
                                String namaBaru = sc.nextLine();
                                System.out.print(" Harga Produk: ");
                                int hargaBaru = sc.nextInt();
                                System.out.print(" Stok Produk: ");
                                int stokBaru = sc.nextInt();
                                p = new cProduk(namaBaru, hargaBaru, stokBaru);
                                break;
                            case 2:
                                // Menu Edit Produk
                                System.out.println("1. Ubah Stok Produk");
                                System.out.println("2. Ubah Harga Produk");
                                System.out.print("Pilih (1/2) = ");
                                int ubahProduk = sc.nextInt();
                                // mengecek pilihan produk yang akan dirubah
                                if (ubahProduk == 1) {
                                    System.out.println("Stok Baru = ");
                                    stokBaru = sc.nextInt();
                                    // Konfirmasi
                                    System.out.println("Apakah Yakin?");
                                    System.out.println("1. Ya");
                                    System.out.println("2. Tidak");
                                    System.out.print("Pilih (1/2) = ");
                                    konfirmasi = sc.nextInt();
                                    if (konfirmasi == 1) {
                                        p.setStokProduk(stokBaru);
                                        System.out.println(" Stok Berhasil Dirubah");
                                    } else {
                                        System.out.println(" Stok Gagal Dirubah");
                                    }
                                } else {
                                    System.out.println("Harga Baru = ");
                                    hargaBaru = sc.nextInt();
                                    // Konfirmasi
                                    System.out.println("Apakah Yakin?");
                                    System.out.println("1. Ya");
                                    System.out.println("2. Tidak");
                                    System.out.print("Pilih (1/2) = ");
                                    konfirmasi = sc.nextInt();
                                    if (konfirmasi == 1) {
                                        p.setHargaProduk(hargaBaru);
                                        System.out.println(" Harga Berhasil Dirubah");
                                    } else {
                                        System.out.println(" Harga Gagal Dirubah");
                                    }
                                }
                                break;
                            case 3:
                                // Menu Hapus Produk
                                System.out.println(" Nama Produk = ");
                                sc = new Scanner(System.in);
                                String nama = sc.nextLine();
                                // hapus produk
                                System.out.println("Apakah Yakin?");
                                System.out.println("1. Ya");
                                System.out.println("2. Tidak");
                                System.out.print("Pilih (1/2) = ");
                                konfirmasi = sc.nextInt();
                                if (nama.equalsIgnoreCase(p.getNamaProduk())) {
                                    if (konfirmasi == 1) {
                                        p = null;
                                        System.out.println("Produk Berhasil Dihapus");
                                    } else {
                                        System.out.println("Produk Gagal Dihapus");
                                    }
                                } else {
                                    System.out.println("Produk Tidak Ada");
                                }
                                break;
                            case 4:
                                // Menu Detail Produk
                                if (p != null) {
                                    System.out.println(p.ubahMenjadiKalimat());
                                } else {
                                    System.out.println("Produk Tidak Ada");
                                }
                                break;
                        }

                    } while (menuProduk != 5);
                    break;
                // Menu Pembeli
                case 2:
                    
                    break;
                // Menu Transaksi
                case 3:

                    break;

            }
        } while (pilihMenu != 4);

        // objek pertama produk

    }

}