import java.util.Scanner;
public class Day66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        for ( int i = 1; i <= n; i++){
            if( i  == 1 || i == n){
                System.out.println("+");
            }else { System.out.println("*");}
        }
        in.close();
    }
}
