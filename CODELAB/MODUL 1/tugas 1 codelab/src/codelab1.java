import java.util.Scanner;
import java.time.LocalDate;

public class codelab1 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        //  memasukkan Nama
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        //  memasukkan Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin (L/P): ");
        char gender = input.next().charAt(0);

        //  Tahun Lahir pengguna
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        // Menghitung umur menggunakan LocalDate
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelamin = "";
        if (gender == 'L' || gender == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (gender == 'P' || gender == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak valid";
        }

        // Menampilkan output
        System.out.println("\nData Diri Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup Scanner
        input.close();
    }
}
