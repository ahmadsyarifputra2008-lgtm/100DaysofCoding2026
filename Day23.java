
import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        // menghitung luas persegi 

        Scanner i = new Scanner (System.in);

        System.out.println("======= MENGHITUNG LUAS PERSEGI ======");
        System.out.print("panjang  Sisi persegi : ");
        int s = i.nextInt();

        System.out.println("jadi luas persegi nya adalah : "+(s*s) + " CM^2");
        i.close();
  }
}
