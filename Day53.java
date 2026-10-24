import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        int a = i.nextInt();
        int b = i.nextInt();

        do{
            int hasil = a%2;
            if( hasil == 0){
                System.out.println(a);
                
            } a++;
        }while(a <= b);
        i.close();
    }
    
    
}
