import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        try ( // Operasi aritmatika perkalian(*) dan pembagian(/)
                Scanner input = new Scanner(System.in)) {
            System.out.println("PERKALIAN");
            System.out.println("Masukkan Nilai nya ngab!!!");  
            System.out.print("Nilai pertama : ");
            int x = input.nextInt();
            
            System.out.print("Nilai kedua : ");
            int y = input.nextInt();
            
            int z = x * y;
            System.out.println("hasil perkalian : "+z+"\n");

            System.out.println("PEMBAGIAN");

            System.out.print("Nilai pertama : ");
            double a = input.nextDouble();
            
            System.out.print("Nilai kedua : ");
            double b = input.nextDouble();

            double m = a / b;
            System.out.println("hasil pembagian: "+m);
        }

    }
}
