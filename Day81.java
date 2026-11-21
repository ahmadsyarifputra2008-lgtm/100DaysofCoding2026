
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int [] array1 = new int  [5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] =  in.nextInt();
        }
        System.out.println();
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

    }
}
