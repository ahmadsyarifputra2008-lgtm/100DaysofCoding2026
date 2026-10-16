import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
         Scanner i = new Scanner(System.in);

        System.out.print("Masukkan Pilihan (1-4): ");
        int a = i.nextInt();
        int c,d;
        switch (a) {
            case 1:
                c = i.nextInt();
                d = i.nextInt();
                System.out.println("Hasil penjumlahan: " + (c + d));       
                break;
        
            case 2 :
                System.out.println("=== Pengurangan ===");

                System.out.print("angka 1: ");
                c = i.nextInt();
                System.out.print("angka 2: ");
                d = i.nextInt();
                System.out.println("Hasil pengurangan: " + (c - d));    
                break;

            case 3 :
                System.out.println("=== Perkalian ===");

                System.out.print("angka 1: ");
                c = i.nextInt();
                System.out.print("angka 2: ");
                d = i.nextInt();
                System.out.println("Hasil perkalian: " + (c * d));    
                break;

            case 4 :
                System.out.println("=== Pembagian ===");
                System.out.print("angka 1: ");
                c = i.nextInt();
                System.out.print("angka 2: ");
                d = i.nextInt();
                System.out.println("Hasil pembagian: " + (c / d));    
                break;
            
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        i.close();
    }
}
