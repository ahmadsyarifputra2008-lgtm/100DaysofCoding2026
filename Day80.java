import java.util.Scanner;
public class Day80 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int[] array1 = {1, 2, 3, 4, 5}; //data Array

        int i = in.nextInt(); // input nilai yang akan menjadi index dari dataanya
         System.out.println(array1[i]); // memanggil var Array nya untuk menentukan index sesuai inputan
      
        in.close();
    }
}
