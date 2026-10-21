
import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
    Scanner i = new Scanner(System.in);

    System.out.print("angka : ");
    int  a = i.nextInt();

    System.out.print("angka "+a);
    String b  = (a %2==0 )? " Adalah Bilangan Genap": " adalah Bilangan Ganjil";
    System.out.println(b);

    i.close();
    }


}
