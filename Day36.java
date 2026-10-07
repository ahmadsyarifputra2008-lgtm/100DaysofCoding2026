import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        // menentukan bilangan ganjil atau genap
        Scanner i = new Scanner(System.in);

        int a = i.nextInt();

        if (a % 2 ==0){
            System.out.println("bilangan genap");
        }
        else{
            System.out.println("bilangan ganjil ");
        }
    }
}
