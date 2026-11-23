
import java.util.Scanner;


public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int []arr = new int [3];
        int jumlah = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            jumlah += arr[i];
        }

        System.out.println(jumlah);
    }
}
