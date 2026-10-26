
import java.util.Scanner;

public class ontinue1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        while(true){
            a++;

            if ( a == 10){
                break; //  menghentikan perulangan
            }else if (a == 5){
                continue; // skip perulangan sesuai range yang di tuju
            }else if (a == 7) {
                return; // mengembalikan perulangan itu sendiri/ keluar dari method
            }
            System.out.println("looping ke : "+a);
            
        }System.out.println("looping selesai");

        i.close();
    }
}
