
import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        long hasil = 1;

        for( int i =1; i<= n ; i++){
            hasil *= m;
        }
        System.out.print(hasil +" ");

      in.close();
    }
}
