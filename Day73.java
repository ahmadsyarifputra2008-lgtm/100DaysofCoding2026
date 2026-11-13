import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        // latihan :  do while: membuat menu berulang

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1-3): ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Tambah.");
                    break;
                case 2:
                    System.out.println("Anda memilih Kurang.");
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 3); // Terus ulangi selama pilihan bukan 3 (Keluar)
       
    }
}
