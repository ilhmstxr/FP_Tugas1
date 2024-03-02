package App;

import java.util.Arrays;

public class cProduk {
    // data
    private String namaBarang;
    private int hargaBarang, stokBarang;

    // constructor
    cProduk() {
        System.out.println("Telah Dibuat");
    }

    cProduk(String n, String j, String k, int h, int s, int u) {
        namaBarang = n;
        hargaBarang = h;
        stokBarang = s;
        System.out.println("Objek" + namaBarang + "Dibuat");
    }

    
    // method

    // untuk mengedit suatu harga barang
    public void setHargaBarang(int h) {
        hargaBarang = h;
    }

    // untuk mengedit suatu stok barang
    public void setStokBarang(int s) {
        stokBarang = s;
    }

    // getter untuk mengambil suatu data
    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public String ubahMenjadiKalimat() {
        return namaBarang + "Stok : " + stokBarang + "Rp. " + hargaBarang;
    }


}