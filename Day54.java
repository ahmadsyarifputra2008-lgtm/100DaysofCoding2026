
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        int x = i.nextInt();
        int y = i.nextInt();
        int z = i.nextInt();

        if (y > x){
            x++;
        
        } else if ( y < x){
            x--;
        }
        if ( z > x){
            x += 2 ;

        }else if ( z < x){
            x-=2;
        }
        System.out.println(x);
    }
}
