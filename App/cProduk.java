package App;

import java.util.Arrays;

public class cProduk {
    private String[] namaBarang;
    private int[] hargaBarang, stokBarang, idBarang;
    int besar;

    public cProduk(String[] n, int[] h, int[] s, int[] id) {
        namaBarang = n;
        stokBarang = s;
        hargaBarang = h;
        this.idBarang = id;
        besar = 0;

        // inisialisasi array awal
        namaBarang = new String[] { "sosis kanzler", "sosis champp", "sosis sonice",
                "nugget fiesta", "nugget goldstar",
                "nugget kanzler", "dimsum ayam", "dimsum udang", "dimsum keju", "chikuwa shifudo", "chikuwa cedea",
                "chikuwa sunfish" };

        hargaBarang = new int[] { 42000, 32000, 29000, 38000, 42000, 45000,
                25000,
                27000, 26000, 27000, 24000, 26000 };

        stokBarang = new int[] { 53, 42, 18, 45, 30, 52, 24, 26, 21, 38, 41, 36
        };

        idBarang = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.println("Berhasil Di Generate");
    }

    public void ekspansi(String newNama, int newHarga, int newStok) {
        // ekspansi besar array
        namaBarang = Arrays.copyOf(namaBarang, namaBarang.length + 1);
        hargaBarang = Arrays.copyOf(hargaBarang, hargaBarang.length + 1);
        stokBarang = Arrays.copyOf(stokBarang, stokBarang.length + 1);
        idBarang = Arrays.copyOf(idBarang, idBarang.length + 1);

        // tambah produk baru
        int idAkhir = namaBarang.length;
        namaBarang[idAkhir] = newNama;
        hargaBarang[idAkhir] = newHarga;
        stokBarang[idAkhir] = newStok;
        idBarang[idAkhir] = idAkhir;
    }

    public void setBarang(String newNama, int newHarga, int newStok) {

    }

    // method

}