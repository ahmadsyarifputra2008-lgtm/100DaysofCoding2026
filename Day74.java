
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        // method String (length(), to upperCase(), lowerCase())
        Scanner in = new Scanner (System.in);

        String n = in.nextLine();

        System.out.println(n.length()); // mencari length
        System.out.println(n.toLowerCase()); // mencari length
        System.out.println(n.toUpperCase()); // mencari length

        in.close();
    }
}
