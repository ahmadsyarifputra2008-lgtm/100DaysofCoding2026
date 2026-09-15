
import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
       // operasi aritmatika modulus(%) atau sisa bagi

        /*
        modulus ini berfungsi membagi bilangan dan memberitahu hasil dari sisa bagi-nya,
        ini dapat mempermudah kita untuk menentukan bilangan ganjil atau genap
        */

        System.out.println("== MENCARI APAKAH BILANGAN INI GANJI ATAU GENAP ==");

        Scanner modul = new Scanner(System.in);

        System.out.println("masukkanmi nilainya bosku!!");

        System.out.print("Nilai  = ");
        int angka = modul.nextInt();

        int z = angka % 2; // kalau sisa baginya habis atau 0 berarti angka itu genap 

        boolean sisa = z == 0; // naahh kalau angkanya genap, disini nilainya pasti true, kalau ganjil ya falseeee
        System.out.println("Hasil Sisa Bagi : "+z);
        System.out.println("apakah angka ini genap? : "+sisa);
        modul.close();
    }
    
}
