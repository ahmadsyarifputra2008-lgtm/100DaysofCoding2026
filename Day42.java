import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama         : ");
        String nama = input.nextLine();

        System.out.print("Gaji                  : Rp. ");
        double gajiPokok = input.nextDouble();

        // Variabel penampung pajak dan bonus
        double pajak = 0;
        double bonus = 0;

        // Percabangan if-else sesuai kondisi soal
        if (gajiPokok > 20000000) {
            pajak = 0.05 * gajiPokok; // Pajak 5%
            bonus = 500000;           // Bonus Rp. 500.000
        } else {
            pajak = 0;                // Tidak dikenai pajak
            bonus = 300000;           // Bonus Rp. 300.000
        }

        // Perhitungan gaji bersih
        double gajiBersih = gajiPokok - pajak + bonus;

        
        System.out.println("\nOutput :");
        System.out.println("Nama               : " + nama);
        System.out.printf("Gaji Pokok         : Rp. %,.0f\n", gajiPokok);
        System.out.printf("Total Pajak        : Rp. %,.0f\n", pajak);
        System.out.printf("Bonus              : Rp. %,.0f\n", bonus);
        System.out.printf("Gaji bersih        : Rp. %,.0f\n", gajiBersih);

        input.close();
    }
}
