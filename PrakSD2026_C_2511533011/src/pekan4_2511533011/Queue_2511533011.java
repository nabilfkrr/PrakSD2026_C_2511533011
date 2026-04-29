package pekan4_2511533011;
import java.util.Scanner;

public class Queue_2511533011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLoket_2511533011 queue_3011 = new AntrianLoket_2511533011(20);
        
        int pilihan_3011;
        
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_3011 = sc.nextInt();
            sc.nextLine(); // membersihkan buffer
            
            switch (pilihan_3011) {
                case 1:
                    if (queue_3011.isFull_3011(queue_3011)) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.print("Masukkan nama pelanggan : ");
                        String nama = sc.nextLine();
                        queue_3011.enqueue_3011(nama);
                    }
                    break;
                    
                case 2:
                    String keluar = queue_3011.dequeue_3011();
                    if (keluar == null) {
                        System.out.println("Antrian kosong, tidak ada yang dihapus!");
                    } else {
                        System.out.println(keluar + " telah dilayani");
                    }
                    break;
                    
                case 3:
                    System.out.println("\nIsi Antrian : ");
                    queue_3011.display_3011();
                    break;
                    
                case 4:
                    if (queue_3011.isEmpty_3011(queue_3011)) {
                        System.out.println("Antrian kosong, tidak bisa di-reverse!");
                    } else {
                        queue_3011.reverse_3011();
                        System.out.println("Antrian berhasil di-reverse!");
                        queue_3011.display_3011();
                    }
                    break;
                    
                case 5:
                    System.out.println("Terima kasih, program selesai!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
            
        } while (pilihan_3011 != 5);
        
        sc.close();
    }
}