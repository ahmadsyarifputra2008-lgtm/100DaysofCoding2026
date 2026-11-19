import java.util.Arrays;
public class Day79 {

    public static void main(String[] args) {
        //array 1D

        System.out.println("inisialisasi array 1D");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array 1D: " + Arrays.toString(numbers));

        System.out.println();
        
        System.out.println("deklarasi array 1D");
        int[]array1 =  new int [5];
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;
        System.out.println("Array 1D: " + Arrays.toString(array1));

    }
}
