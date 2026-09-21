import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        //Konversi nilai tipe data primitif ke tipe data string
        /*
        valueOf()
        toString()
        */

        Scanner i = new Scanner (System.in);

        // jadi saya cuma mengonversi beberapa tipe data saja 

        System.out.print("Nilai tipe data Byte : ");
        byte a = i.nextByte();
        
        System.out.print("Nilai tipe data integer : ");
        int b = i.nextInt();

        System.out.print("Nilai tipe data double : ");
        double c = i.nextDouble();
        
        System.out.print("Nilai tipe data char : ");
        char d = i.next().charAt(0);
        
        System.out.print("Nilai tipe data boolean : ");
        boolean e = i.nextBoolean();

        String a1 = String.valueOf(a);
        String integer = String.valueOf(b);
        String c1 = String.valueOf(c);
        String d1 = String.valueOf(d);
        String e1 = String.valueOf(e);

        System.out.println("string - byte \t: "+a1);
        System.out.println("string - int \t: "+integer);
        System.out.println("string - double : "+c1);
        System.out.println("string - byte \t: "+d1);
        System.out.println("string - byte \t: "+e1);

        

 
    }
}
