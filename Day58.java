import java.util.Scanner;
public class Day58{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();
        
        // perulangan N-1
        for( int i = n; i>= 1 ; i--){
            if( i%2==0){
                System.out.print(i+ " ");

            }
        }System.out.println(" ");
        
        for( int i = n; i>= 1; i--){
            if( i%2!=0){
                System.out.print(i+ " ");

            }
        }
       
        in.close();
    }
}
