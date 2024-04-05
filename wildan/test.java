import javax.swing.table.DefaultTableModel;

public class test {
    private DefaultTableModel tableModel;
    private int stokProduk, hargaProduk, indexProduk;
    private int maxProduk = 100;
    private cProduk[] produkArray = new cProduk[100];
    private String namaProduk;

    test(String nama, int jumlah, int harga) {
        if (indexProduk >= maxProduk) {
            namaProduk = nama;
            hargaProduk = harga;
            stokProduk = jumlah;
        } else {
            System.out.println("Array produk sudah penuh");
        }
    }


    public cProduk[] getProdukArray() {
        return produkArray;
    }
}