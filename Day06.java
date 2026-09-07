import java.util.Scanner;
public class Day06 {
    public static void main(String[] args) {
        // Tipe data karakter (char) dan boolean
        /*
         char -> tipe data ini untuk menyimpan karakter tunggal, misalnya huruf, angka  atau simbol.
         boolean -> tipe data ini untuk menyimpan nilai true atau false.
        */

        //contoh penggunaan tipe data char
        System.out.println("\nContoh penggunaan tipe data char:");
        char lakiLaki = 'L';
        char perempuan = 'P';
        System.out.println("Jenis Kelamin Laki-laki: " + lakiLaki);
        System.out.println("Jenis Kelamin Perempuan: " + perempuan);
        
        //contoh penggunaan tipe data boolean
        System.out.println("\nContoh penggunaan tipe data boolean:");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Apakah Java menyenangkan? " + isJavaFun);
        System.out.println("Apakah ikan enak? " + isFishTasty + "\n");

        //CONTOH KASUS menggunakan tipe data boolean
        System.out.println("Menentukan apakah seseorang sudah cukup umur untuk mengemudi");

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        boolean cukupUmur = umur >= 17; // jika umur lebih besar atau sama dengan 17, maka cukupUmur bernilai true, jika tidak maka bernilai false
        System.out.println("Apakah seseorang sudah cukup umur untuk mengemudi? " + cukupUmur);
        
    }
    
}
