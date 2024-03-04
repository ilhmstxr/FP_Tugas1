package AppKasirCahyo;

import java.util.Scanner;

public class appKasir {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cProduk p = new cProduk();
        cProduk p2 = new cProduk("nig", 200000, 203);
        cPembeli pb = new cPembeli("Ilham", "Surabaya");
        cTransaksi tr = new cTransaksi();
        int pilih = 0;
        int jwb;

        do {
            System.out.println("\nMENU APP");
            System.out.println("1. Produk");
            System.out.println("2. Pembeli");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit ");
            System.out.print("PIlih = ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("[Produk]");
                    System.out.println(" 1. Tambah");
                    System.out.println(" 2. Ubah");
                    System.out.println(" 3. Hapus");
                    System.out.println(" 4. Detil");
                    System.out.print(" pilih = ");
                    int pilih2 = sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            // tips using nextLine
                            sc = new Scanner(System.in);
                            System.out.print("  Nama = ");
                            String nama = sc.nextLine();
                            System.out.print("  harga = ");
                            int harga = sc.nextInt();
                            System.out.print("  stok = ");
                            int stok = sc.nextInt();

                            p2 = new cProduk(nama, harga, stok);
                            break;
                        case 2:
                            System.out.println("  1. Ubah Stok");
                            System.out.println("  2. Ubah Harga");
                            System.out.print("  pilih = ");
                            int ubah = sc.nextInt();
                            // Ubah stok
                            if (ubah == 1) {
                                System.out.print("  Stok Baru = ");
                                int u = sc.nextInt();
                                jwb = konfirmasi();

                                if (jwb == 1) {
                                    p2.setStok(u);
                                    System.out.println("  Stok Berhasil Dirubah");
                                } else {
                                    System.out.println("  Stok Gagal Dirubah");
                                }
                            } // ubah harga
                            else {
                                System.out.print("  Harga Baru = ");
                                int u = sc.nextInt();
                                jwb = konfirmasi();

                                if (jwb == 1) {
                                    p2.setHarga(u);
                                    System.out.println("  Harga Berhasil Dirubah");
                                } else {
                                    System.out.println("  Harga Gagal Dirubah");
                                }
                            }

                            break;
                        case 3:
                            System.out.print("  nama = ");
                            nama = sc.next();
                            jwb = konfirmasi();

                            if (nama.equalsIgnoreCase(p2.getNama())) {
                                if (jwb == 1) {
                                    p2 = null;
                                    System.out.println("Porudk Berhasil Dihapus");
                                } else {
                                    System.out.println("Batal Hapus!");
                                }

                            } else {
                                System.out.println("Produk Tidak Ada");
                            }

                            break;
                        case 4:
                            if (p2 != null) {

                                System.out.println(p2.ToString());
                            } else {
                                System.out.println("Objek Kosong");
                            }

                            break;
                    }
                    break;
                case 2:
                    System.out.println("[Pembeli]");

                    break;
                case 3:
                    System.out.println("[Transaksi]");
                    System.out.println("1. Tambah");
                    System.out.println("2. Ubah");
                    System.out.println("3. Hapus");
                    System.out.println("4. Cetak");
                    System.out.print("pilih = ");
                    pilih2 = sc.nextInt();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Nama = ");
                            String n = sc.next();
                            System.out.print("Produk = ");
                            String pr = sc.next();
                            System.out.print(" Jumlah = ");
                            int j = sc.nextInt();
                            if (pr.equalsIgnoreCase(p2.getNama())) {
                                int t = j * p2.getHarga();
                                pb = new cPembeli(n);
                                tr.setPembeli(pb);
                                tr.setProduk(p2);
                                tr.setJumlah(j);
                                tr.setTotal(t);
                            } else {
                                System.out.println("Produk tidak ada");
                            }
                            break;
                        case 2:
                            System.out.print(" Nama Produk = ");
                            pr = sc.next();
                            if (pr.equalsIgnoreCase(tr.getProduk().getNama())) {
                                System.out.print(" Jumlah Baru  = ");
                                j = sc.nextInt();

                                jwb = konfirmasi();

                                if (jwb == 1) {
                                    tr.setJumlah(j);
                                    tr.setTotal(j * tr.getProduk().getHarga());
                                    System.out.println("Ubah sukses");
                                } else {
                                    System.out.println("Ubah Batal");
                                }
                            } else {
                                System.out.println("Tidak ada transaksi");
                            }

                            break;
                        case 3:
                            System.out.println(" Nama Transaksi = ");
                            pr = sc.next();
                            break;
                        case 4:
                            if (tr != null) {
                                System.out.println("Pembeli: " + tr.getPembeli().getNama());
                                System.out.println("Produk: " + tr.getProduk().getNama());
                                System.out.println("Jumlah: " + tr.getJumlah());
                                System.out.println("Harga: " + tr.getProduk().getHarga());
                                System.out.println("Total: " + tr.getTotal());
                            } else {
                                System.out.println("Transaksi kosong");
                            }
                            break;

                    }

                    break;
                case 4:
                    System.out.println("Terima kasih");
            }
        } while (pilih != 4);
    }

    public static int konfirmasi() {
        System.out.println("Yakin Ubah?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("pilih = ");
        int jawab = sc.nextInt();
        return jawab;
    }
}
