import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n = in.nextInt();
        int faktorial = 1;

        for( int i = 1; i<= n; i++){
            faktorial *= i;
            System.out.print(i + " ");
        }

        System.out.println("\nFaktorial dari " + n + " adalah: " + faktorial);
    }
}
