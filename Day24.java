
import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        // menghitung Luas persegi Panjang

        Scanner i = new Scanner(System.in);

        System.out.println("============ LUAS PERSEGI PANJANG ============");
        System.out.print("Panjang :");
        int p = i.nextInt();

        System.out.print("Lebar :");
        int l = i.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("Luas : Panjang * Lebar");
        System.out.println("jadi luas  dari persegi Panjang adalah : "+(p * l)+ " cm");
        System.out.println("===============================================");
        i.close();
    }
}
