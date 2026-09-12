
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        // Operasi aritmatika penjumlahan(+) dan pengurangan(-)

       Scanner input = new Scanner(System.in);

       System.out.println("Masukkan Nilai nya lurr");

       System.out.print("Nilai pertama : "); 
       int x = input.nextInt();

       System.out.print("Nilai kedua : ");
       int y = input.nextInt();
    
       int z = x + y;
       int m = x - y;
       System.out.println("hasil penjumlahan : "+z);
       System.out.println("hasil pengurangan : "+m);
       input.close();

    }
}
