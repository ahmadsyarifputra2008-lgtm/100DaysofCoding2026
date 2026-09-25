
import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        // MENGHITUNG lUAS LINGKARAN

        Scanner i = new Scanner(System.in);
        
         System.out.println("=========== LUAS LINGKARAN ===========");
        System.out.print("Jari-jari : ");
        double j = i.nextDouble();

        final double  PI = 3.14;
        System.out.println("Nilai PI : "+PI);
        System.out.println("------------------------------------------");
        double luasLingkaran = PI * (j*2);
        System.out.println("jadi Luas Lingkarannya adalah : "+luasLingkaran);

        int k = (int)luasLingkaran; // dia tidak membulatkan tapi haanya memotong angka dibalakang koma
        System.err.println("Nilai luas yang di konversi ke bilangan bulat : "+k);
        System.out.println("=============================================");

        i.close();  
    }
}
