public class Day10 {
    public static void main(String[] args) {
        //PEMAHAMAN BATAS MAKSIMAL DAN MINIMAL DARI TIPE DATA   
        System.out.println("\nBatas maksimal dan minimal dari tipe data:\n"); 
        
        // TIPE DATA BILANGAN BULAT

        //Tipe data byte.
        System.out.println("Batas maksimal byte: " + Byte.MAX_VALUE); // Batas maksimal byte adalah 127
        System.out.println("Batas minimal byte: " + Byte.MIN_VALUE +"\n"); // Batas minimal byte adalah -128
        
        //Tipe data short.
        System.out.println("Batas maksimal short: " + Short.MAX_VALUE); // Batas maksimal short adalah 32767
        System.out.println("Batas minimal short: " + Short.MIN_VALUE + "\n");  // Batas minimal short adalah -32768

        //Tipe data int.
        System.out.println("Batas maksimal int: " + Integer.MAX_VALUE); // Batas maksimal int adalah 2147483647
        System.out.println("Batas minimal int: " + Integer.MIN_VALUE + "\n"); // Batas minimal int adalah -2147483648

        //Tipe data long.
        System.out.println("Batas maksimal long: " + Long.MAX_VALUE); // Batas maksimal long adalah 9223372036854775807
        System.out.println("Batas minimal long: " + Long.MIN_VALUE + "\n"); // Batas minimal long adalah -9223372036854775808


        // TIPE DATA BILANGAN DESIMAL

        //Tipe data float.
        System.out.println("Batas maksimal float: " + Float.MAX_VALUE); // Batas maksimal float adalah 3.4028235E38
        System.out.println("Batas minimal float: " + Float.MIN_VALUE + "\n"); // Batas minimal float adalah 1.4E-45

        //Tipe data double.
        System.out.println("Batas maksimal double: " + Double.MAX_VALUE); // Batas maksimal double adalah 1.7976931348623157E308
        System.out.println("Batas minimal double: " + Double.MIN_VALUE + "\n"); // Batas minimal double adalah 4.9E-324

        // TIPE DATA KARAKTER
        //Tipe data char.
        System.out.println("Batas maksimal char: " + (int) Character.MAX_VALUE); // Batas maksimal char adalah 65535
        System.out.println("Batas minimal char: " + (int) Character.MIN_VALUE + "\n"); // Batas minimal char adalah 0

        //untuk tipe data boolean tidak memiliki batas maksimal dan minimal karena hanya memiliki dua nilai yaitu true dan false.
    }
}

