
import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        // OPERASI PENUGASAN (==, +=, -=, <=, >=, DLL)

        /*
        =  : sama dengan.
        += : Menyederhanakan operasi x = x + y.
        -= : Menyederhanakan operasi x = x - y.
        /= : Menyederhanakan operasi x = x / y.
        %= : Menyederhanakan operasi x = x % y.
        *= : Menyederhanakan operasi x = x * y.
        */

        Scanner in = new Scanner (System.in);


        System.out.println("== OPERASI PENUGASAN ==");
        // Okee kita kasi nilai misalnya x = 10, dan y = 5
        System.out.print("masukkan nilai X : ");
        int x = in.nextInt(); //disini kita tidak perlu menyatakan variabel y, karna kita langsung saja tambahkan ke dalam operasi nya
         

        // += -> penugasan penjumlahan
        int a = x += 5;
        System.out.println("+= : x + y = "+a);

        // -= -> penugasan Pengurangan
        int b = x -= 5;
        System.out.println("-+ : x - y = "+b);

        // *= -> penugasan Perkalian
        int c = x *= 5;
        System.out.println("*= : x * y = "+c);

        // /= -> penugasan Pembagian
        int d = x /= 5;
        System.out.println("/= : x / y = "+d);

        // %= -> penugasan Sisa Bagi
        int e = x %= 5;
        System.out.println("%= : x % y = "+e);
        in.close();
    }
}
