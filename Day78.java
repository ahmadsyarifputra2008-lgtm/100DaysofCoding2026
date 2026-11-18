import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        //membuat akun dan login ke akun (menggunakan loop berhenti ketika username dan passwordnya benar)
        Scanner scanner = new Scanner(System.in);

        String username = "admin";
        String password = "admin123";

        System.out.println("Selamat datang di sistem login!");
        while (true) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil! Selamat datang, " + username + "!");
                break;
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }
    }
}
