import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        //LATIHAN : PROGRAM UNTUK MENUKAR DUA NILAI VARIABEL

        System.out.println("========== PEMBAGIAN PRESISI ==========");

        Scanner i = new Scanner(System.in);

        System.out.print("masukkan Total Nilai : ");
        int totalNilai = i.nextInt();

        System.out.print("Masukkan Jumlah siswa : ");
        int jumlahSiswa = i.nextInt() ;


        // pembagiann yang tidak presisi menggunakan  konversi tipe data otomatis
        double rataNilaiSalah = totalNilai / jumlahSiswa; //  int/int menghasilkan nilai yang dibulatkan.
        System.out.println("Rata-rata nilai yang tidak presisi : "+rataNilaiSalah);


        // pembagian yang presisi menggunakan kopnversi tipe data manual
        double rataNilaiBenar = (double)totalNilai / jumlahSiswa;
        System.out.printf("Rata-rata Nilai Siswa yang presisi %.2f: ",rataNilaiBenar);
        
        i.close();
    }
}
