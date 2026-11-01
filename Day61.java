
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int total = 1;

        for (int i = 1; i<= n ; i++){
            System.out.print(i + " x ");
            total*=i;
        }System.out.print("\b\b = " + total);
      in.close();
    }
}
