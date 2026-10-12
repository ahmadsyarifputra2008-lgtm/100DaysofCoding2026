import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan (°C): ");
        int suhu = input.nextInt();

        // Pengecekan kondisi temperatur menggunakan if-else
        if (suhu < 18) {
            System.out.println("Kategori: Ruangan Dingin");
        } else if (suhu <= 25) {
            System.out.println("Kategori: Ruangan Normal / Sejuk");
        } else {
            System.out.println("Kategori: Ruangan Panas");
        }

        input.close();
    }
}
