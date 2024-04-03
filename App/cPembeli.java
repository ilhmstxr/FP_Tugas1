package App;

public class cPembeli {
    private String nama, alamat;

    private String namaMember, telpMember, tglLahir;
    private String member[][];

    cPembeli() {
        member = new String[100][3];
        System.out.println("Constructor Pembeli Dibuat..");
    }

    cPembeli(String n) {
        nama = n;
        // alamat= a;
        System.out.println(nama + " Dibuat..");
    }

    // fungsi getter
    public String getnama() {
        return nama;
    }

    // list daftar member
    public String[][] listMember() {
        // for (int i = 0; i < ; i++) {

        // }
        return member;
    }

    // registrasi member
}
