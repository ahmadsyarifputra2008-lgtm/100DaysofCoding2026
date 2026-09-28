
import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        //  operasi Decrement dan increment (++, --)

        /*
        increment -> (a++),(++a) -> +1
        Decrement -> (b--)(--b) -> -1
        */

        Scanner i = new Scanner (System.in);

        System.out.println("===  post Increment & post decrement ===");
        System.out.print("Nilai a : ");
        int a = i.nextInt();
        a++; //nilai a ditambah 1, dan nilainya akan berubah
        System.out.println("nilai setelah a++  : "+a);
        a--; // nilai a berkurang 1 dari nilai yang sebelumnya
        System.out.println("nilai  setelah a-- : "+a);

        System.out.println("===  pre-Increment & pre-decrement ===");
        System.out.print("Nilai b : ");
        int b = i.nextInt();
        ++b; //nilai  ditambah 1, dan nilainya akan berubah
        System.out.println("nilai setelah ++b  : "+b);
        --b; // nilai  berkurang 1 dari nilai yang sebelumnya
        System.out.println("nilai  setelah --b : "+b);

        System.out.println("\n=== Perbedaan Post-Increment vs Pre-Increment ===");
        int c = i.nextInt();
        int d = i.nextInt();

        // Post-Increment: Cetak nilai c' lama dulu, baru 'c' ditambahkan 1
        System.out.println("Cetak (a++)     : " + (c++)); // hasilnya sama dengan inputan
        System.out.println("Nilai c saat ini: " + c);     // disini baru di perlihatkan nilai yang sudah di tambahkan

        // Pre-Increment: 'd' bertambah dulu , setelah nilainya  sudah bertambah, baru dicetak
        System.out.println("Cetak (++d)     : " + (++d)); // hasilnya disini sudah melalui proses penjumlahan
        System.out.println("Nilai d saat ini: " + d);     // tinggal meencetak nilai yang baru yang sudah di jumlahkan
        


        

        


    }
}
