import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        // Data awal
        int sisaKarcis = 5; // Sisa karcis antrean

        System.out.println("=== MESIN LOKET TIKET ===");
        System.out.println("Sisa karcis saat ini: " + sisaKarcis);

        System.out.print("Masukkan Umur Anda : ");
        int umur = i.nextInt();

        System.out.print("Apakah Punya Kartu VIP? (true/false) : ");
        boolean isVIP = i.nextBoolean();

        
        // Tiket diambil 1 untuk proses ini, lalu sisa berkurang
        System.out.println("\nMemproses tiket... (Nomor karcis Anda diolah, sisa sebelum dikurangi: " + (sisaKarcis--) + ")");

        
        // Syarat Masuk Layanan:
        // (Umur >= 17 ATAU Punya VIP) DAN (Sisa karcis setelah dikurangi masih >= 0)
        boolean bolehMasuk = (umur >= 17 || isVIP) && (sisaKarcis >= 0);

        System.out.println("\n----------------- HASIL -----------------");
        System.out.println("Sisa Karcis Tersisa : " + sisaKarcis);
        System.out.println("Status Diizinkan Masuk : " + bolehMasuk);

        scanner.close();
    }
}
