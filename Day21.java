
import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        //konversi nilai tipe data string ke tipe data primitif

        String nama, umur, tinggiBadan, jenisKelamin, status;
        
        System.out.print("Masukkan nama :");
        nama = i.nextLine();
        
        System.out.print("Masukkan umur :");
        umur = i.nextLine();
        
        System.out.print("Masukkan Tinggi badan :");
        tinggiBadan = i.nextLine();

        System.out.print("Masukkan Jenis kelamin :");
        jenisKelamin = i.nextLine();

        System.out.print("Masukkan Status keaktifan :");
        status = i.nextLine();

        
        int b = Integer.parseInt(umur);
        double c = Double.parseDouble(tinggiBadan);
        char d = jenisKelamin.charAt(0); // untuk variable char sendiri itu berbeda dengan lainnya
        boolean e = Boolean.parseBoolean(status); 



        System.out.println("=========== Bio Data ==========");
        System.out.println( "Nama(string) \t\t: "+nama);
        System.out.println( "Umur(int) \t\t: "+b);
        System.out.println("tinggi badan(double) \t: "+c);
        System.out.println( "Jenis Kelamin(char) \t: "+d);
        System.out.println( "Status aktif(Boolean)\t: "+e);
        System.out.println("===============================");
        i.close();

        
    }
}
