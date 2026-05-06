package Pekan5_2511533011;
import java.util.Scanner;

public class RumahSakit_2511533011 {

    // ATRIBUT SLL
    private Pasien_2511533011 head_3011;       // Pointer ke node terdepan (head)
    private Pasien_2511533011 tail_3011;       // Pointer ke node terakhir (tail)
    private int counterAntrian_3011;           // Counter auto-increment nomor antrian
    private int jumlahPasien_3011;             // Total pasien dalam antrian

    // CONSTRUCTOR
    public RumahSakit_2511533011() {
        head_3011           = null;
        tail_3011           = null;
        counterAntrian_3011 = 0;
        jumlahPasien_3011   = 0;
    }
    // 1. DAFTARKAN PASIEN — Insert at Tail
    public void daftarkanPasien_3011(String nama_3011, String keluhan_3011) {
        // Auto-increment nomor antrian
        counterAntrian_3011++;
        jumlahPasien_3011++;

        // Buat node baru
        Pasien_2511533011 newPasien_3011 = new Pasien_2511533011(nama_3011, keluhan_3011, counterAntrian_3011);

        // Jika list kosong, node baru langsung jadi head dan tail
        if (head_3011 == null) {
            head_3011 = newPasien_3011;
            tail_3011 = newPasien_3011;
        } else {
            // Sambungkan node terakhir ke node baru, lalu geser tail
            tail_3011.setNext_3011(newPasien_3011);
            tail_3011 = newPasien_3011;
        }

        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counterAntrian_3011);
    }
    // 2. PANGGIL PASIEN — Delete Head
    public void panggilPasien_3011() {
        // Tangani kondisi list kosong
        if (head_3011 == null) {
            System.out.println("Antrian kosong! Tidak ada pasien yang perlu dipanggil.");
            return;
        }

        // Simpan data head sebelum dihapus
        Pasien_2511533011 dipanggil_3011 = head_3011;

        // Geser head ke node berikutnya
        head_3011 = head_3011.getNext_3011();

        // Jika setelah dihapus list jadi kosong, reset tail juga
        if (head_3011 == null) {
            tail_3011 = null;
        }

        jumlahPasien_3011--;

        // Tampilkan data pasien yang dipanggil
        System.out.println("=== Pasien Dipanggil ===");
        System.out.println("Nomor Antrian : " + dipanggil_3011.getNomorAntrian_3011());
        System.out.println("Nama          : " + dipanggil_3011.getNamaPasien_3011());
        System.out.println("Keluhan       : " + dipanggil_3011.getKeluhan_3011());
    }
    // 3. TAMPILKAN ANTRIAN — Display (Traversal)
    public void tampilkanAntrian_3011() {
        // Tangani kondisi list kosong
        if (head_3011 == null) {
            System.out.println("Antrian kosong! Belum ada pasien terdaftar.");
            return;
        }

        System.out.println("==== Daftar Antrian Pasien ====");
        Pasien_2511533011 curr_3011 = head_3011; // Mulai dari head
        int posisi_3011 = 1;

        // Telusuri sampai pointer null
        while (curr_3011 != null) {
            System.out.println("Posisi " + posisi_3011 + " :");
            System.out.println("  No. Antrian : " + curr_3011.getNomorAntrian_3011());
            System.out.println("  Nama        : " + curr_3011.getNamaPasien_3011());
            System.out.println("  Keluhan     : " + curr_3011.getKeluhan_3011());
            if (curr_3011.getNext_3011() != null) System.out.println("       |");
            curr_3011 = curr_3011.getNext_3011(); // Geser pointer ke node berikutnya
            posisi_3011++;
        }
    }
    // 4. CARI PASIEN — Search (Case-Insensitive)
    public void cariPasien_3011(String namaCari_3011) {
        // Tangani kondisi list kosong
        if (head_3011 == null) {
            System.out.println("Antrian kosong! Tidak ada pasien untuk dicari.");
            return;
        }

        Pasien_2511533011 curr_3011 = head_3011;
        boolean ditemukan_3011 = false;

        System.out.println("=== Hasil Pencarian: \"" + namaCari_3011 + "\" ===");

        // Telusuri seluruh list
        while (curr_3011 != null) {
            // Perbandingan case-insensitive menggunakan toLowerCase()
            if (curr_3011.getNamaPasien_3011().toLowerCase().contains(namaCari_3011.toLowerCase())) {
                System.out.println("  Pasien ditemukan!");
                System.out.println("  No. Antrian : " + curr_3011.getNomorAntrian_3011());
                System.out.println("  Nama        : " + curr_3011.getNamaPasien_3011());
                System.out.println("  Keluhan     : " + curr_3011.getKeluhan_3011());
                ditemukan_3011 = true;
            }
            curr_3011 = curr_3011.getNext_3011();
        }

        // Tampilkan pesan jika tidak ditemukan
        if (!ditemukan_3011) {
            System.out.println("  Pasien dengan nama \"" + namaCari_3011 + "\" tidak ditemukan.");
        }
    }
    // 5. CEK STATUS ANTRIAN
    public void cekStatusAntrian_3011() {
        System.out.println("=== Status Antrian ===");

        if (head_3011 == null) {
            System.out.println("Antrian kosong! Tidak ada pasien saat ini.");
        } else {
            System.out.println("Total Pasien dalam Antrian : " + jumlahPasien_3011);
            System.out.println("--- Pasien Terdepan ---");
            System.out.println("  No. Antrian : " + head_3011.getNomorAntrian_3011());
            System.out.println("  Nama        : " + head_3011.getNamaPasien_3011());
            System.out.println("  Keluhan     : " + head_3011.getKeluhan_3011());
        }
    }
    // MAIN — Menu Interaktif
    public static void main(String[] args) {
        Scanner scanner_3011 = new Scanner(System.in);
        RumahSakit_2511533011 rs_3011 = new RumahSakit_2511533011();
        int pilihan_3011;

        do {
            // Tampilkan menu
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511533011 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_3011 = scanner_3011.nextInt();
            scanner_3011.nextLine(); // consume newline

            switch (pilihan_3011) {
                case 1:
                    System.out.print("Masukkan Nama Pasien : ");
                    String nama_3011 = scanner_3011.nextLine();
                    System.out.print("Masukkan Keluhan     : ");
                    String keluhan_3011 = scanner_3011.nextLine();
                    rs_3011.daftarkanPasien_3011(nama_3011, keluhan_3011);
                    break;
                case 2:
                    rs_3011.panggilPasien_3011();
                    break;
                case 3:
                    rs_3011.tampilkanAntrian_3011();
                    break;
                case 4:
                    System.out.print("Masukkan Nama yang dicari : ");
                    String cari_3011 = scanner_3011.nextLine();
                    rs_3011.cariPasien_3011(cari_3011);
                    break;
                case 5:
                    rs_3011.cekStatusAntrian_3011();
                    break;
                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Masukkan angka 1-6.");
            }

        } while (pilihan_3011 != 6);

        scanner_3011.close();
    }
}
