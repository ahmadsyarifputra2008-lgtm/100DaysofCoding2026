import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        //  latihan :menggunakan berbagai berbagai method String
         Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("Halo, " + nama + "!");
        System.out.println("Panjang nama anda: " + nama.length());
        System.out.println("Nama anda dalam huruf besar: " + nama.toUpperCase());
        System.out.println("Nama anda dalam huruf kecil: " + nama.toLowerCase());
        System.out.println();

        System.out.println("pengecekan nama anda");
        System.out.println("Apakah nama anda mengandung huruf 'a'? = " + nama.contains("a"));
        System.out.println("yang penting bacaannya sama (equalsIgnoreCase)=  " + nama.equalsIgnoreCase(nama));
        System.out.println("Apakah nama anda sama dengan 'hensem'? = " + nama.equals("hensem"));
        System.out.println();
        System.out.println("Nama anda setelah di trim: " + nama.trim());
        System.out.println("Nama anda setelah di replace: " + nama.replace("a", "@"));
        System.out.println("Nama anda setelah di substring: " + nama.substring(0, 3));
        





    }
}
