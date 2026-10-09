import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        // membuat menu menggunakan if

        Scanner i = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Mie goreng");
        System.out.println("3. Ayam goreng");
        System.out.print("Pilih opsi (1-3): ");
        int pilihan = i.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Ayam Goreng");
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
