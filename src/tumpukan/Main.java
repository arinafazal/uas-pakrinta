package tumpukan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek tumpukan dari kelas tumpukan.tumpukanGG
        tumpukanGG tumpukan = new tumpukanGG();
        Scanner input = new Scanner(System.in);

        // Loop utama program untuk menampilkan menu interaktif
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Push Angka");       // Menambahkan angka ke dalam tumpukan
            System.out.println("2. Pop Ganjil");      // Menghapus angka ganjil dari tumpukan
            System.out.println("3. Pop Genap");       // Menghapus angka genap dari tumpukan
            System.out.println("4. Cetak Tumpukan");  // Menampilkan isi tumpukan (ganjil & genap)
            System.out.println("5. Keluar");          // Keluar dari program
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();           // Membaca pilihan dari pengguna

            switch (pilihan) {
                case 1:
                    // Menu untuk menambahkan angka-angka ke dalam tumpukan
                    System.out.println("Masukkan angka-angka (ketik -1 untuk kembali ke menu):");
                    while (true) {
                        System.out.print("Angka: ");
                        int angka = input.nextInt();
                        if (angka == -1) break;       // Jika input -1, kembali ke menu utama
                        tumpukan.push(angka);         // Menambahkan angka ke tumpukan
                    }
                    break;
                case 2:
                    // Menghapus angka ganjil dari tumpukan
                    tumpukan.popganjil();
                    break;
                case 3:
                    // Menghapus angka genap dari tumpukan
                    tumpukan.popgenap();
                    break;
                case 4:
                    // Menampilkan isi tumpukan (angka ganjil dan genap)
                    System.out.println("\n== Isi Tumpukan ==");
                    tumpukan.cetakganjil();           // Cetak angka-angka ganjil
                    tumpukan.cetakgenap();            // Cetak angka-angka genap
                    break;
                case 5:
                    // Keluar dari program
                    System.out.println("Keluar dari program. Terima kasih!");
                    input.close();                    // Menutup scanner
                    return;                           // Mengakhiri program
                default:
                    // Menangani pilihan menu yang tidak valid
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}