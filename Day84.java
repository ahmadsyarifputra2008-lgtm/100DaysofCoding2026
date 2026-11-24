import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int [] arr = new int [3];
        int jum = arr[0];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if ( jum < arr[i] ){
                 jum = arr[i];
            }
           
        }
        System.out.println(jum);
        
    }
    
}
