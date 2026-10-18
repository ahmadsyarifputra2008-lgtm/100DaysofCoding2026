
import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        System.out.println("=== urutan hari berdasarakan angka ===");
        System.out.println("masukkan angka (1-7)");
        int a = i.nextInt();

        switch (a){
            case 1 :
                System.out.println("hari Senin");
                System.out.println("yah hari senin, kapan minggunya");
                break;
            case 2 :
                System.out.println("hari Selasa");
                System.out.println("ah biasa ini mah");
                break;
            case 3 :
                System.out.println("hari rabu");
                System.out.println("ah biasa ini mah");
                break;
            case 4 :
                System.out.println("hari kamis");
                System.out.println("ah biasa ini mah");
                break;
            case 5 :
                System.out.println("hari jum'at");
                System.out.println("ah biasa ini mah");
                break;
            case 6 :
                System.out.println("hari Sabtu");
                System.out.println("ah biasa ini mah");
                break;
            case 7 :
                System.out.println("hari Minggu");
                System.out.println("tidur pun sodap nii");
                break;

                default:
                    System.out.println("hari tidak di ketahui");
        }
    }
}
