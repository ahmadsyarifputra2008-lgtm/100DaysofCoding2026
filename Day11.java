import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // MENERIMA INPUT DARI USER ATAU(SCANNER)
        /* scanner adalah sebuah fungsi dari java untuk dapat menerima input dari luar baris code
        atau langsung dari user */

        //contoh penggunaan Scanner
        Scanner userInput = new Scanner (System.in);
        System.out.print(" umur kamu berapa : ");
        int umur = userInput.nextInt();

        boolean isUsia = umur >= 18;
        System.out.println("apakah kamu sudah Dewasa ? :"+isUsia);
        
    }
}
