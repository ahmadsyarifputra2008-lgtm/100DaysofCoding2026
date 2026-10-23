
import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        int a = i.nextInt();
        int b = i.nextInt();

        while (a <= b) {
            int hasil = a %2;
            if ( hasil == 1){
                System.out.println(a);
            }
            a++;
        }
        
        i.close();
    }
}
