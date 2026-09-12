import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        try ( // Operasi aritmatika perkalian(*) dan pembagian(/)
                Scanner input = new Scanner(System.in)) {
            System.out.println("Masukkan Nilai nya ngab!!!");
            
            System.out.print("Nilai pertama : ");
            int x = input.nextInt();
            
            System.out.print("Nilai kedua : ");
            int y = input.nextInt();
            
            int z = x * y;
            double m = x / y;
            System.out.println("hasil perkalian : "+z);
            System.out.println("hasil pembagian: "+m);
            input.close();
        }

    }
}
