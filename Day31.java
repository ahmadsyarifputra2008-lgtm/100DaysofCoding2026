
import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        // operator logika AND(&&), OR(||), NO(!)

        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan Nilai ujian : ");
        int a = i.nextInt();

        System.out.print("Masukkan IPK : ");
        double b = i.nextDouble();

        System.out.print("Kehadiran (%): " );
        int c = i.nextInt();

        System.out.print("apakah pernah melanggar aturan (true / false ): ");
        boolean adaPelanggaran = i.nextBoolean();
        
        System.out.println("======= informasi =======");
        
        // jika nilainya > 70 DAN kehadirannya sama = 100,  maka dia lulus 
        boolean lulus = (a >= 70) && (c == 100);
        System.out.println("Apakah dia lulus ?: "+lulus);

        // jika nilainya(a) > 65 atau IPK nilai > 3.0, maka dia lulus
        boolean organisasi =  (a >= 65 ) || (b >= 3.0);
        System.out.println("apakah pantas masuk organisasi ? : "+ organisasi);

        // jika berperilaku baik maka hasil outputnya true dan inputnya false, karna berperilaku baik sama dengan TIDAK ada pelanggaran
        boolean berperilakuBaik = !adaPelanggaran;
        System.out.println("apakah berperilaku baik ? : "+berperilakuBaik);
    
        i.close();
    }
}
