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

        System.out.println("== OPERASI PENUGASAN ==");
        // Okee kita kasi nilai misalnya x = 10, dan y = 5

        int x = 10; //disini kita tidak perlu menyatakan variabel y, karna kita langsung saja tambahkan ke dalam operasi nya
         

        // +=
        int a = x += 5;
        System.out.println("+= : x + y = "+a);

        // -=
        int b = x -= 5;
        System.out.println("-+ : x - y = "+b);

        // *=
        int c = x *= 5;
        System.out.println("*= : x * y = "+c);

        // /=
        int d = x /= 5;
        System.out.println("/= : x / y = "+d);

        // %=
        int e = x %= 5;
        System.out.println("%= : x % y = "+e);
    }
}
