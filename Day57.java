import java.util.Scanner;
public class Day57 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();
        
        // perulangan 1-N
        for( int i = 1; i<= n ; i++){
            if( i%2==0){
                System.out.print(i+ " ");

            }
        }
        System.out.println(" ");
        for( int i = 1; i<= n ; i++){
            if( i%2!=0){
                System.out.print(i+ " ");

            }
        }
       
        in.close();
    }
}
