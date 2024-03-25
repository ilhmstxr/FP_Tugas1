package AppKasirCahyo;

public class cPembeli {
    private String nama, alamat;

    cPembeli() {
        System.out.println("Constructor Pembeli Dibuat...");
    }

    cPembeli(String n) {
        nama = n;
        System.out.println(nama + " Dibuat..");
    }

    cPembeli(String n, String a) {
        nama = n;
        alamat = a;
        System.out.println(nama + alamat + " Dibuat...");
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
