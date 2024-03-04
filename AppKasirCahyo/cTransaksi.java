package AppKasirCahyo;

public class cTransaksi {

    private cPembeli pbl;
    private cProduk prd;
    private int jumlah, total;
    private String kode, tgl;

    cTransaksi() {
        System.out.println("Default const berhasil dibuat");
    }

    // cara 1
    public void setPembeli(String n, String a) {
        pbl = new cPembeli(n, a);
    }

    // cara 2
    public void setPembeli(cPembeli pb) {
        pbl = new cPembeli();
        pbl = pb;
    }

    public void setProduk(cProduk p) {
        prd = new cProduk();
        prd = p;
    }

    public void setTotal(int t) {
        total = t;
    }

    public void setJumlah(int j) {
        jumlah = j;
    }

    public cPembeli getPembeli() {
        return pbl;
    }

    public cProduk getProduk() {
        return prd;
    }

    public int getTotal() {
        return total;
    }

    public int getJumlah() {
        return jumlah;
    }
}