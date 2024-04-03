package wildan;

public class cProduk {
    private String nama;
    private int stok, harga;
    
    cProduk(String n, int h, int s) {
        stok = s;
        nama = n;
        harga = h;  
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int h) {
        harga = h;
    }

    public void setStok(int s) {
        stok = s;
    }

}