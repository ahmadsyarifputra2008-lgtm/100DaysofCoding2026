
import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        // nested if 
        Scanner i = new Scanner(System.in);

        int a = i.nextInt();

        if (a > 0){
            System.out.print("bIilangan positif dan ");
            if (a % 2 == 0){
                System.out.println("Merupakan bilangan kelipatan 2");
            }
        }
        else{
            System.out.println("bilangan negatif ");
        }

       i.close(); 
    }
}
