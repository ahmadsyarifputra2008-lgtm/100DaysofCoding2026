import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Masukkan Nilai ujian : ");
        int a = i.nextInt();

        if (a >= 70){
            System.out.println("Selamat, Anda Lulus");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus");
        }
        i.close();
    }
}
