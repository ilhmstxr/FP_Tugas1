package App;

import java.util.Scanner;

class appKasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inisialisasi array awal
        // cProduk produk = new cProduk(new String[] {}, new int[] {}, new int[] {}, new
        // int[] {});

        // array buat mengisi id barang
        int[] id = new int[50];
        for (int i = 0; i < id.length; i++) {
        id[i] = i;
        }

        // array barang
        String[] barang = new String[50];

        barang[0] = "sosis kanzler";
        barang[1] = "sosis champp";
        barang[2] = "sosis sonice";
        barang[3] = "nugget fiesta";
        barang[4] = "nugget goldstar";
        barang[5] = "nugget kanzler";
        barang[6] = "dimsum ayam";
        barang[7] = "dimsum udang";
        barang[8] = "dimsum keju";
        barang[9] = "chikuwa shifudo";
        barang[10] = "chikuwa cedea";
        barang[11] = "chikuwa sunfish";

        // mengecek data di array barang
        for (int i = 0; i < barang.length; i++) {
            System.out.println(i + ". " + barang[i]);
        }

        // jika ingin menambah barang
        System.out.print("barang baru = ");
        String newBarang = sc.next();

        // looping lalu mengecek jika array kosong maka akan diisi data baru
        for (int i = 0; i < barang.length; i++) {
            if (barang[i] == null) {
                barang[i] = newBarang;
                break;
            }
        }

        // menegecek deata di array barang
        for (int i = 0; i < barang.length; i++) {
            System.out.println(i + ". " + barang[i]);
        }

    }

}