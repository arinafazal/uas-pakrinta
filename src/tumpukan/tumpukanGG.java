package tumpukan;

public class tumpukanGG {
    private node topGanjil; // Pointer ke elemen teratas stack untuk angka ganjil
    private node topGenap;  // Pointer ke elemen teratas stack untuk angka genap

    // Constructor untuk menginisialisasi stack kosong
    public tumpukanGG() {
        topGanjil = null; // Stack ganjil awalnya kosong
        topGenap = null;  // Stack genap awalnya kosong
    }

    // Method push() untuk menambahkan data ke stack ganjil atau genap
    public void push(int data) {
        if (data < 0) { // Memeriksa apakah angka negatif
            System.out.println("Angka negatif tidak diperbolehkan!");
            return; // Keluar dari method jika angka negatif
        }

        // Membuat tumpukan.node baru dengan data yang dimasukkan
        node newNode = new node(data, null);

        // Jika angka genap, tambahkan ke stack genap
        if (data % 2 == 0) {
            newNode.setPtg(topGenap); // Hubungkan tumpukan.node baru ke tumpukan.node teratas stack genap
            topGenap = newNode;      // Update topGenap menjadi tumpukan.node baru
        } else {
            // Jika angka ganjil, tambahkan ke stack ganjil
            newNode.setPtg(topGanjil); // Hubungkan tumpukan.node baru ke tumpukan.node teratas stack ganjil
            topGanjil = newNode;       // Update topGanjil menjadi tumpukan.node baru
        }
    }

    // Method popganjil() untuk menghapus elemen teratas dari stack ganjil
    public void popganjil() {
        if (topGanjil == null) { // Memeriksa apakah stack ganjil kosong
            System.out.println("Stack ganjil kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGanjil.getData() + " dari stack ganjil.");
            topGanjil = topGanjil.getPtr(); // Pindahkan pointer topGanjil ke tumpukan.node berikutnya
        }
    }

    // Method popgenap() untuk menghapus elemen teratas dari stack genap
    public void popgenap() {
        if (topGenap == null) { // Memeriksa apakah stack genap kosong
            System.out.println("Stack genap kosong! Tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Menghapus " + topGenap.getData() + " dari stack genap.");
            topGenap = topGenap.getPtr(); // Pindahkan pointer topGenap ke tumpukan.node berikutnya
        }
    }

    // Method cetakganjil() untuk mencetak semua elemen di stack ganjil
    public void cetakganjil() {
        System.out.print("Isi Tumpukan Ganjil: ");
        node current = topGanjil; // Memulai dari elemen teratas stack ganjil
        while (current != null) { // Iterasi hingga tumpukan.node kosong
            System.out.print(current.getData() + " "); // Cetak data pada tumpukan.node saat ini
            current = current.getPtr(); // Pindah ke tumpukan.node berikutnya
        }
        System.out.println(); // Baris baru setelah selesai mencetak
    }

    // Method cetakgenap() untuk mencetak semua elemen di stack genap
    public void cetakgenap() {
        System.out.print("Isi Tumpukan Genap: ");
        node current = topGenap; // Memulai dari elemen teratas stack genap
        while (current != null) { // Iterasi hingga tumpukan.node kosong
            System.out.print(current.getData() + " "); // Cetak data pada tumpukan.node saat ini
            current = current.getPtr(); // Pindah ke tumpukan.node berikutnya
        }
        System.out.println(); // Baris baru setelah selesai mencetak
    }
}