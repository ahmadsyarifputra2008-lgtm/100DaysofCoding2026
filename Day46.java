
import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        System.out.println("===== Menu wareg =====");
        System.out.print("Pilih menu (1-3)  : ");
        int a = i .nextInt();

        System.out.print("jumlah            : ");
        int b = i.nextInt();

        System.out.println("======================");

        switch (a){
            case 1 :
                System.out.println("ayam goreng => Rp 15.000/porsi");
                int ag = b*15000;
                System.out.println("total harga :"+ag);
                break;
            case 2 :
                System.out.println("Nasi kuning => Rp 10000/porsi");
                int nk = b*10000;
                System.out.println("total harga :"+nk);
                break;
            case 3 :
                System.out.println("tahu bakar => Rp 5000/porsi");
                int tb = b*5000;
                System.out.println("total harga :"+tb);
                break;

                default:
                    System.out.println("pilihan tidak tersedia");
                    break;
        }
        System.out.println("======================");
    }
}
