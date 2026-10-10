import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        // memebuat kalkulator sederhana menggunakan if 
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = i.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = i.nextInt();

        System.out.println("Pilih operasi: ");
        System.out.println("1. Penjumlahan(+)");
        System.out.println("2. Pengurangan(-)");
        System.out.println("3. Perkalian(*)");
        System.out.println("4. Pembagian(/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = i.nextInt();

        if (pilihan == 1) {
            System.out.println(bilangan1 + " + " + bilangan2 + " = " + (bilangan1 + bilangan2));
        } else if (pilihan == 2) {
            System.out.println(bilangan1 + " - " + bilangan2 + " = " + (bilangan1 - bilangan2));
        } else if (pilihan == 3) {
            System.out.println(bilangan1 + " * " + bilangan2 + " = " + (bilangan1 * bilangan2));
        } else if (pilihan == 4) {
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + (bilangan1 / bilangan2));
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        i.close();
    }
}

        
        
    

