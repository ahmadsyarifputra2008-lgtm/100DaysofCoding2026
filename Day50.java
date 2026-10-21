
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
    Scanner i = new Scanner(System.in);

    System.out.print("angka : ");
    int  a = i.nextInt();

    System.out.print("angka "+a);
    String c = ( a == 0)?" Angka nol":(a %2 == 0)?" Bilangan genap":(a %2!=0)?" Bilangan ganjil":" angka tidak diketahui";
    
    System.out.println(c);

    i.close();
    }


}
