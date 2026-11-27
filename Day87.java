
import java.util.Arrays;
import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int [] arr =new int [3];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
    
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[0];
            arr[0] = arr[2];
            arr[2]= temp;
        }
      
        System.out.println(Arrays.toString(arr));

        
    }
}
