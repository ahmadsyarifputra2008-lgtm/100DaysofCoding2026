import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int angka;

        do {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = input.nextInt();


            if (angka >= 0) {
                total += angka;
            }
        } 
        while (angka >= 0); // Terus ulangi selama angka bukan negatif
        
        System.out.println("Total penjumlahan: " + total);
        input.close();
    }
}
