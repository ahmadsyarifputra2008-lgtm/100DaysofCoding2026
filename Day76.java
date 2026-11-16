
public class Day76 {
    public static void main(String[] args) {
        //METHOD STRING (substring(), replace(), trim())


        String n = "  GILA KAMU  ";

        System.out.println(n.substring(2, 6)); // digunakan untuk mengambil karakter dari index tertentu sampai index terakhr yang ditentukan.
        System.out.println(n.replace(n, "KAMU YANG GILA")); //  digunakan untuk mengganti karakter tertentu dengan karakter lain
        System.out.println(n.trim()); // digunakan untuk menghapus spasi di awal dan akhir string
    }
}
