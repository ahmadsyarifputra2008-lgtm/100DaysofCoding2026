import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        // latihan
        Scanner i = new Scanner(System.in);

        double n = i.nextDouble();
       
        if ( n >= 80){
            System.out.println("Nilai : A");
        }
        else if ( n <= 79 && n >= 70 ){
            System.out.println("Nilai : B");
        }
        else if ( n <= 69 && n >= 50 ){
            System.out.println("Nilai : c");
        }
        else if ( n <= 49 && n >=0 ){   
            System.out.println("Nilai : D");
        }
        else{ System.out.println(" nilai tidak terbaca atau nilai Error");}
       
        i.close();
    }
}

