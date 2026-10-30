
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        for ( int i =1; i<=n; i+=m){
            System.out.print(i+ " ");
        }
    }
}
