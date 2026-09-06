import java.util.Scanner;

public class Day05 {

    public static void main(String[] args) {
        // TIPE DATA PECAHAN (Double, Float)
        // tipe data ini untuk angka pecahan atau decimal

        /*
        float  -> 4 byte (32 bit) - yang artinya lebih hemat memory daripada double dan wajib di akhiri huruf f/F.
        double -> 8 byte (64 bit) - pilihan standar java untuk perhitungan desimal yang akurat.
        */

        float tinggi = 157.5f; // akhriran huruf f
        double nilaiPi = 3.1415926535;
        
        System.out.println(" float : tinggi = "+tinggi);
        System.out.println(" double : nilaiPi = "+nilaiPi);

        //CONTOH KASUS
        // KONVERSI MATA UANG DOLAR KE RUPIAH
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dolar: ");

        Double jumlahDolar = input.nextDouble(); // input dari user berupa angka pecahan
        Double kurs = 15000.0;
        Double rupiah = kurs * jumlahDolar;
        System.out.println("Nilai Rupiah: " + rupiah);
    }
}
