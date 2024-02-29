package App;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class cTransaksi {

    // private String[] transaksi = new String[50];
    // LocalDate date = LocalDate.now();
    // LocalTime time = LocalTime.now();

    // public static void main(String[] args) {
    // System.out.println("Hello World!");
    // }
    private String[] transkasi;

    public cTransaksi() {
        System.out.println("Transaksi berhasil dibuat");
    }

    public void ekspansi(){
        transkasi = Arrays.copyOf(transkasi, transkasi.length + 1);
    }

    public void setTranskasi(String newTranskasi){
        transkasi.ekspansi();
        
    }
    



}
