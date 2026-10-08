import java.util.Scanner;
public class Day37 {
    public static void main(String[] args) {
        // menetukan bilangan postitf, negatif dan nol

        Scanner i = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan: ");
        int a = i.nextInt();
        if (a > 0) {
            System.out.println("bilangan positif");
        }
        else if (a < 0) {
            System.out.println("bilangan negatif");
        }
        else {
            System.out.println("bilangan nol");
        }
    }
}
