
import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
     
        // konversi otomatis(tipe dat kecil ke tipe data besar)

        Scanner i = new Scanner (System.in);

        System.out.print("Masukkan Nilai yang bertipe data Byte :");
        byte nilaiByte = i.nextByte();


        int nilaiInt = nilaiByte; // mengubah tipe data Byte ke Integer

        double nilaiDouble = nilaiInt; // mengubah tipe data integer ke double

        System.out.println("konversi tipe data byte => int : "+nilaiInt);
        System.out.println("konversi tipe data int => double :"+nilaiDouble);
        
   }
    
}
