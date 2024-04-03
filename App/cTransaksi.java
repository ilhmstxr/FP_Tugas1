package App;

import java.time.LocalDateTime;
import java.util.Scanner;

public class cTransaksi {

    static Scanner sc = new Scanner(System.in);
    private cPembeli pembeli;
    private cProduk produk[];
    private int qtyPrd[], subtotalPrd[];
    private int idxPrd, maxPrd;
    int jwb;

    private int jumlah, total;
    private String kode, tanggal;

    cTransaksi() {
        produk = new cProduk[50];
        qtyPrd = new int[10];
        subtotalPrd = new int[10];
        idxPrd = 0;
        maxPrd = 10;
        System.out.println("Default const berhasil dibuat");
    }

    public void setPembeli(String nama) {
        pembeli = new cPembeli(nama);
    }

    public void setProduk(cProduk p) {
        produk[idxPrd] = new cProduk();
        produk[idxPrd] = p;
    }

    public void setTotal(int total) {
        total = this.total;
    }

    public void setJumlah(int jumlah) {
        jumlah = this.jumlah;
    }

    public cPembeli getPembeli() {
        return pembeli;
    }

    public cProduk[] getProduk() {
        return produk;
    }

    public int getTotal() {
        return total;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getIdxPrd() {
        return idxPrd;
    }

    // keranjang
    public void tambahProduk(cProduk p, int j) {
        if (idxPrd < maxPrd) {
            produk[idxPrd] = p;
            qtyPrd[idxPrd] = j;
            subtotalPrd[idxPrd] = j * p.getHargaProduk();
            idxPrd++;
        } else {
            System.out.println("Keranjang penuh !");
        }
    }

    public void lihatKeranjang() {
        System.out.println("Keranjang");
        for (int i = 0; i < idxPrd; i++) {
            System.out.println((i + 1) + ". " + produk[i].getNamaProduk() + " [" + qtyPrd[i] + "]");
        }
        System.out.println("");
    }

    public void hapusProduk(String namaProduk) {
        boolean ketemu = false;

        for (int i = 0; i < idxPrd; i++) {
            if (namaProduk.equalsIgnoreCase(produk[i].getNamaProduk())) {
                ketemu = true;
                jwb = konfirmasi();

                if (jwb == 1) {
                    produk[i] = null;
                    for (int j = 0; j < idxPrd; j++) {
                        if (j == idxPrd - 1) {
                            produk[j] = null;
                        } else {
                            produk[j] = produk[j + 1];
                        }
                    }
                    idxPrd--;
                    System.out.println("Hapus sukses");
                } else {
                    System.out.println("Hapus gagal");
                }
            }
        }
    }

    public int konfirmasi() {
        System.out.println("Yakin Ubah?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.print("pilih = ");
        int jawab = sc.nextInt();
        return jawab;
    }

    public void cetakStruk() {
        String pembatasG = "--------------------";
        String pembatasSD = "====================";
        System.out.println(pembatasG);
        System.out.println("FROZEN FOOD KULBET");
        for (int i = 0; i < produk.length; i++) {
            System.out.println(produk[i].getNamaProduk());
            System.out.println(
                    produk[i].getKodeProduk() + "" + qtyPrd[i] + "" + produk[i].getHargaProduk() + "" + subtotalPrd[i]);
        }
        System.out.println(pembatasG);
    }

}
