
import java.util.Scanner;


public class Day43 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = i.nextInt();
    
        if (n %3 == 0 && n%5 == 0){
            System.out.println("termasuk kelipatan 3 & 5");
        }
        else if (n %3 == 0){
            System.out.println("kelipatan 3");
        }
        else if ( n %5 ==0 ){
            System.out.println("kelipatan  5");
        }
        else { System.out.println("BUKAN kelipatan 3 maupun 5");}

        i.close();
        
    }

    
}
