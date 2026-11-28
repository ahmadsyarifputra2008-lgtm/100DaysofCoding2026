import java.util.Arrays;
import java.util.Scanner;

public class Day88 {
    //void 1
    public static void cetakGaris(){
        System.out.println("=======================");
    }

    public static void dataArr (int [] dataArray){
        System.out.println(Arrays.toString(dataArray));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("program mulai");

        cetakGaris();

        int [] arr = new int [3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        dataArr(arr);
    }
    
}
