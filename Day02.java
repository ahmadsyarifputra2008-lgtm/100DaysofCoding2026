public class Day02 {
    public static void main(String[] args) throws Exception {
        // Membuat data diri menggunakan println(), print(), printf()
        String Nama, Alumni, Alamat, Prodi;
         Nama = "Ahmad syarif putra";
         Alumni = "UPTD SMK NEGERI 3 MAJENE";
         Alamat = "Pamboang";
         Prodi = "Informatika";

        System.out.println("== Data Diri ==\n");

        System.out.println("Menggunakan println()\n");
        System.out.println("Nama = "+Nama);
        System.out.println("Alumni = "+Alumni);
        System.out.println("Alamat = "+Alamat);
        System.out.println("Prodi = "+Prodi);

        System.out.println("\nMenggunakan printf()\n");
        
        System.out.printf("Nama = %s%n", Nama);
        System.out.printf("Alumni = %s%n", Alumni);
        System.out.printf("Alamat = %s%n", Alamat);
        System.out.printf("Prodi = %s%n", Prodi);


        System.out.println("\nMenggunakan print()\n");

        System.out.print("Nama = " + Nama + "\n");
        System.out.print("Alumni = " + Alumni + "\n");
        System.out.print("Alamat = " + Alamat + "\n");
        System.out.print("Prodi = " + Prodi + "\n");
    }
}
