
import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        System.out.print("Umur :  ");
        int a = i.nextInt();

        System.out.print("Umur "+a+" Tahun");

        String b = (a >= 18)? " sudah legal cuyy":" Masih anak-anak";
        System.out.println(b);

        i.close();

    }
}
