
import java.util.Scanner;


public class Day12 {
    public static void main(String[] args) {
        
        // Scanner

        Scanner input = new Scanner(System.in);

        System.out.print("nama : ");
        String nama = input.nextLine();
        System.out.println("Nama saya adalaah :"+nama +"\n");
        

        System.out.print("umur : ");
        int umur = input.nextInt();
        System.out.println("umur saya adalaah :"+umur +"\n");
    

        System.out.print("Alamat  : ");
        String alamat  = input.next();
        System.out.println("alamat saya adalah : "+alamat+"\n");
    

        System.out.print("prodi : ");
        String prodi  = input.next();
        System.out.println("Prodi : "+prodi+"\n");
        

        System.out.print("Mahasiswa aktif ? : ");
        String keaktifan = input.next();
        boolean  keadaan = keaktifan != "hadir";
        System.out.println("Apakah mahasiswa Aktif : "+keadaan+"\n");

        boolean legal = umur >= 18;
        System.out.println("apakah sudah legal ? : "+legal+"\n");

        input.close();
       }
    
}
