public class Day03 {
    public static void main(String[] args) throws Exception {
        // PENGGUNAAN ESCAPE SECUENCE /n, /t DAN LAIN LAIN
        /*
        /t -> tab
        /n -> new line/ Enter
        /b -> backspace
        /f -> form feed
        */

        String nama,prodi;
        int umur;

        nama = "Ahmad Syarif putra";
        umur = 18;
        prodi = "informatika";


        System.out.println("Mengunakan \\t \n");
        System.out.println("Nama \t= "+nama);
        System.out.println("Umur \t= "+umur + "Tahun");
        System.out.println("Prodi \t= "+prodi);


        System.out.println("\nMengunakan \\n \n");       
        System.out.println("Nama \t= "+nama + "\nUmur \t= "+umur + " Tahun" + "\nProdi \t= "+prodi);

        // Menggunakan \b
        String nama2 = "Ahmad Syarif\b\b\b\b\b\b putra";
        System.out.println("\nNama dengan backspace \t= "+nama2);  

      
        // Menggunakan \f
        String nama3 = "Ahmad Syarif\f putra";
        System.out.println("\nNama dengan form feed \t= "+nama3);

        
    }
}
