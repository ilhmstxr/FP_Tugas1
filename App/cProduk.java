package App;

import java.time.LocalDateTime;

public class cProduk {
    // data
    private String namaProduk, kodeProduk;
    private int hargaProduk, stokProduk;
    private int produkKe = 0;

    LocalDateTime date = LocalDateTime.now();
    int tanggal = date.getDayOfMonth();
    int bulan = date.getMonthValue();
    int tahun = date.getYear();
    int jam = date.getHour();
    int menit = date.getMinute();

    // constructor
    cProduk() {
        System.out.println("Telah Dibuat");
    }

    cProduk(String n, int s, int h) {
        produkKe++;
        String urutanProduk = String.format("%03d", produkKe);
        String strBulan = String.format("%02d", bulan);

        kodeProduk = tanggal + "" + strBulan + "" + urutanProduk;
        namaProduk = n;
        hargaProduk = h;
        stokProduk = s;
        System.out.println("Objek " + namaProduk + " Dibuat");
    }

    // method

    // untuk mengedit suatu harga Produk
    public void setHargaProduk(int h) {
        hargaProduk = h;
    }

    // untuk mengedit suatu stok Produk
    public void setStokProduk(int s) {
        stokProduk = s;
    }

    // getter untuk mengambil suatu produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // getter untuk mengambil satuan harga produk
    public int getHargaProduk() {
        return hargaProduk;
    }

    // getter untuk mengambil stok produk
    public int getStokProduk() {
        return stokProduk;
    }

    // getter untuk mengambil kode produk
    public String getKodeProduk(){
        return kodeProduk;
    }

    public String ubahMenjadiKalimat() {
        return namaProduk + "   Stok :  " + stokProduk + "     Rp.     " + hargaProduk;
    }

}