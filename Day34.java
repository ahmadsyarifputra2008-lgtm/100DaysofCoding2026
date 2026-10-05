import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        // percabangan if else if else
         Scanner i = new Scanner(System.in);
        
        System.out.print("Warna lampu : ");
        String lampu = i.nextLine();
        
        if (lampu.equalsIgnoreCase("merah")){
            System.out.println("Berhenti");
        } else if (lampu.equalsIgnoreCase("kuning")){
            System.out.println("Hati-hati");
        } else if (lampu.equalsIgnoreCase("hijau")){
            System.out.println("Jalan");
        } else {
            System.out.println("Warna lampu tidak valid");
        }
        i.close();
    }
}
