public class Day04 {
    public static void main(String[] args) {
        //TIPE DATA NUMERIK BILANGAN BULAT  (byte, short, long, int)

        /*
        byte -> 1 byte (8 bit) -> -128 s/d 127
        short -> 2 bytes (16 bit) -> -32,768 s/d 32,767
        int -> 4 bytes (32 bit) -> -2,147,483,648 s/d 2,147,483,647
        long -> 8 bytes (64 bit) -> -9,223,372,036,854,775,808 s/d 9,223,372,036,854,775,807L
        */

        byte byte1 = 100; //kapan kita menggunakan byte? ketika kita ingin menghemat memory, karena byte hanya 1 byte
        short short1 = 1000; //kapan kita menggunakan short? ketika kita ingin menyimpan nilai yang lebih besar dari byte tetapi tidak sebesar int
        int int1 = 100000; //kapan kita menggunakan int? ketika kita ingin menyimpan nilai yang lebih besar dari short
        long long1 = 1000000L; //kapan kita menggunakan long? ketika kita ingin menyimpan nilai yang lebih besar dari int

        System.out.println("byte1 = " + byte1);
        System.out.println("short1 = " + short1);
        System.out.println("int1 = " + int1);
        System.out.println("long1 = " + long1 + "\n");

        // CONTOH KASUS
        // KEDAI KOPI
        System.out.println("== KEDAI KOPI ==");
        int hargakopi, Pesanan, totalHarga;
        double diskon, totalBayar;

        Pesanan = 5;
        hargakopi = 15000;
        totalHarga = hargakopi * Pesanan;
        diskon = 0.1 * totalHarga;
        totalBayar = totalHarga - diskon;

        System.out.println("Harga Kopi: " + hargakopi);
        System.out.println("Jumlah Pesanan: " + Pesanan);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

    }
    
}
