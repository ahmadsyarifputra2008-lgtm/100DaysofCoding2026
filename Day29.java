
import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        // operator perbendingan < dan >

        /*
        > - lebih besar dari
        < - lebih kecil dari
        */
        System.out.print("Nilai a : ");
        int a = i.nextInt();

        System.out.print("Nilai b : ");
        int b = i.nextInt();


        boolean c = a > b ;
        boolean d = a < b ;
        
        System.out.println(a +" > "+b);
        System.out.println(c);
        System.out.println(a +" < "+b);
        System.out.println(d);

        i.close();
        
    }
}
