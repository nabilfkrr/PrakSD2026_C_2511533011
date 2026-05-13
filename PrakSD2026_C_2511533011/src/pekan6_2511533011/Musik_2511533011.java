package pekan6_2511533011;
import java.util.Scanner;

public class Musik_2511533011 {
    private Lagu_2511533011 head_3011;
    private Lagu_2511533011 tail_3011;

    // 1. Tambah Lagu di Akhir
    public void tambahLagu_3011(String judul_3011, String penyanyi_3011) {
        Lagu_2511533011 baru = new Lagu_2511533011(judul_3011, penyanyi_3011);
        if (head_3011 == null) {
            head_3011 = tail_3011 = baru;
        } else {
            tail_3011.next_3011 = baru;
            baru.prev_3011 = tail_3011;
            tail_3011 = baru;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Hapus Lagu Awal
    public void hapusLaguAwal_3011() {
        if (head_3011 == null) {
            System.out.println("Playlist kosong!");
        } else {
            head_3011 = head_3011.next_3011;
            if (head_3011 != null) head_3011.prev_3011 = null;
            else tail_3011 = null;
            System.out.println("Lagu pertama berhasil dihapus.");
        }
    }

    // 3. Tampil Maju
    public void tampilMaju_3011() {
        if (head_3011 == null) System.out.println("Playlist kosong.");
        Lagu_2511533011 curr = head_3011;
        while (curr != null) {
            System.out.println(curr.judul_3011 + " - " + curr.penyanyi_3011);
            curr = curr.next_3011;
        }
    }

    // 4. Tampil Mundur
    public void tampilMundur_3011() {
        if (tail_3011 == null) System.out.println("Playlist kosong.");
        Lagu_2511533011 curr = tail_3011;
        while (curr != null) {
            System.out.println(curr.judul_3011 + " - " + curr.penyanyi_3011);
            curr = curr.prev_3011;
        }
    }

    // 5. Cari Lagu
    public void cariLagu_3011(String judul_3011) {
        Lagu_2511533011 curr = head_3011;
        boolean found = false;
        while (curr != null) {
            if (curr.judul_3011.equalsIgnoreCase(judul_3011)) {
                System.out.println("Lagu ditemukan: " + curr.judul_3011 + " oleh " + curr.penyanyi_3011);
                found = true;
            }
            curr = curr.next_3011;
        }
        if (!found) System.out.println("Lagu tidak ditemukan.");
    }

    public static void main(String[] args) {
        Musik_2511533011 playlist = new Musik_2511533011();
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("\n=== Playlist Musik NIM: 2511533011 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String j = sc.nextLine();
                    System.out.print("Penyanyi: ");
                    String p = sc.nextLine();
                    playlist.tambahLagu_3011(j, p);
                    break;
                case 2:
                    playlist.hapusLaguAwal_3011();
                    break;
                case 3:
                    playlist.tampilMaju_3011();
                    break;
                case 4:
                    playlist.tampilMundur_3011();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari = sc.nextLine();
                    playlist.cariLagu_3011(cari);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }
}