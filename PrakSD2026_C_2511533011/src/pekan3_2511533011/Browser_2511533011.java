package pekan3_2511533011;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533011 {

    public static void tampilkanMenu_3011() {
        System.out.println("=== Browser History NIM: 2511533011 ===");
        System.out.println("1. Kunjungi Website (Push)");
        System.out.println("2. Tombol Back (Pop)");
        System.out.println("3. Lihat Halaman Aktif (Peek)");
        System.out.println("4. Cek Status History");
        System.out.println("5. Keluar");
    }

    public static void kunjungiWebsite_3011(Stack<Website_2511533011> history, Scanner input) {
        System.out.print("Masukkan Judul: ");
        String judul = input.nextLine();

        System.out.print("Masukkan URL: ");
        String url = input.nextLine();

        history.push(new Website_2511533011(judul, url));
        System.out.println("Berhasil mengunjungi halaman!");
    }

    public static void tombolBack_3011(Stack<Website_2511533011> history) {
        if (history.isEmpty()) {
            System.out.println("History kosong, tidak bisa kembali.");
        } else {
            Website_2511533011 hapus = history.pop();
            System.out.println("Halaman ditutup:");
            System.out.println(hapus.getJudul_3011());
        }
    }

    public static void lihatHalamanAktif_3011(Stack<Website_2511533011> history) {
        if (history.isEmpty()) {
            System.out.println("Tidak ada halaman aktif.");
        } else {
            System.out.println("Halaman aktif:");
            System.out.println(history.peek());
        }
    }

    public static void cekStatus_3011(Stack<Website_2511533011> history) {
        if (history.isEmpty()) {
            System.out.println("History kosong.");
        } else {
            System.out.println("Jumlah history: " + history.size());
        }
    }

    public static void main(String[] args) {
        Stack<Website_2511533011> history = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu_3011();
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    kunjungiWebsite_3011(history, input);
                    break;
                case 2:
                    tombolBack_3011(history);
                    break;
                case 3:
                    lihatHalamanAktif_3011(history);
                    break;
                case 4:
                    cekStatus_3011(history);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilihan != 5);

        input.close();
    }
}