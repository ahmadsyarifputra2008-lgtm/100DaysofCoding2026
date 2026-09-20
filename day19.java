
import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
         //Konversi Manual/Paksa (Dari Tipe Data Besar ke Kecil).

        Scanner in = new Scanner(System.in);

        double nilaidouble = in.nextDouble();

        //konversi paaksa dari nilai double ke integer
        int NilaiInteger = (int)nilaidouble; 

        System.out.println(" Nilai double : "+nilaidouble);
        System.out.println(" konversi Nilai double ke integer : "+NilaiInteger); // angka di belakang koma-nya akan hilaang


    }
}
