
import java.util.Scanner;


public class Day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int[]nilai = {10, 30, 23, 35, 40};

        System.out.print("Mencari Nilai :");
        int n = in.nextInt();
        int posisi = -1;

        for (int i = 0; i < nilai.length; i++) {
            if ( nilai[i] == n){
                posisi = i;
                break;
            }
        }

        if ( posisi != -1){
            System.out.println("terletak di index "+posisi);
        }else {System.out.println("Tida di temukan");}

        in.close();
    }
    
}
