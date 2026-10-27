import java.util.Scanner;
public class Day56 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();
        
        // perulangan 1-N
        for( int i = 1; i<= n ; i++){
            System.out.print(i+ " ");
        }
        System.out.println(" ");
        // perulangan N-1
        for (int i = n; i>=1; i--){
            System.out.print(i+ " ");
        }
    
        in.close();
    }
}
