import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        
    Scanner i = new Scanner (System.in);

    int awal, akhir;

    System.out.print(" angka awal   : ");
    awal = i.nextInt();
    System.out.print(" angka akhir  : ");
    akhir = i.nextInt();

    for (int a = awal; a <= akhir; a++ ){
        System.out.println(a);
    }

       i.close();


    }
}
