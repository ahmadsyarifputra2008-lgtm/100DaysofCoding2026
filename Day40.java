
import java.util.Scanner;

public class mesinkopi {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        // mesin kopi

        System.out.println(" === MESIN KOPI OTOTMATIS");
        System.out.println("menu");
        System.out.println("""
                1. kopi hhitam (Rp 5000)
                2. capuccino (Rp 15000)
                3. teh manis( Rp 4000)
                """);
        System.out.print("pilihan (1-4)");
        int p = i. nextInt();

        if( p == 1){
            System.out.println("anda membeeli kopi hitam");
            System.out.println("silaakan membayar  Rp 5000 ");
        }
        else if(p == 2){
            System.out.println("anda memilih capuccino");   
            System.out.println("silaakan membayar  Rp 15000 ");
        }   
        else if( p == 3){
            System.out.println("anda membeli esteh");
            System.out.println("silaakan membayar  Rp 4000 ");
            }
        else{
            System.out.println("tidak valid");
        }
       
    }
}
