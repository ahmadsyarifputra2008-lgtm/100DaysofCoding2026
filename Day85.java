
import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print(" masukkan jumlah elemen array : ");
         int n = in.nextInt();

         int arr[] = new int [n];

         for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
         }

         int min =arr[0]; // index 0 sebagai nilai minimum sementara

         for (int i = 0; i < arr.length; i++) {
            if ( min > arr[i]){
                min = arr[i];
            }
         }
         System.out.println(min);
       

    }
}
