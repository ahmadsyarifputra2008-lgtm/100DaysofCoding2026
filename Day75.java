import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        // method string (equals(), equalsIgnoreCase(), contains(),isEmpty())
        Scanner in = new Scanner (System.in);

        String n = in.nextLine();
        String m = "";

        System.out.println(n.equals("Hello")); // mencari apakah sama dengan Hello
        System.out.println(n.equalsIgnoreCase("hello")); // mencari apakah sama dengan hello tanpa memperhatikan huruf besar kecil
        System.out.println(n.contains("Hello")); // mencari apakah mengandung Hello 
        System.out.println(n.isEmpty()); // mencari apakah string kosong    
        System.out.println(m.isEmpty()); // mencari apakah string kosong    

    }
}
