package pekan1_2511533011;
import java.util.Scanner;
public class JamDriver2_2511533011 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("=== Program Driver Objek Jam ===");
		// 1. Input Jam Pertama
		System.out.println("\n--- Input Jam 1 ---");
		Jam_2511533011 j1 = buatJamDariInput(input);
		
		// 2. Input Jam Kedua
		System.out.println("\n--- Input Jam 2 ---");
		Jam_2511533011 j2 = buatJamDariInput(input);
		
		// 3. Menampilkan Data
		System.out.println("\n--- Hasil Operasi ---");
		System.out.println("Jam 1 (String)         :" + j1.toString());
		System.out.println("Jam 2 (String)         :" + j2.toString());
		System.out.println("Jam 1 dalam detik      :" + j1.toSeconds());
		System.out.println("Jam 2 dalam detik      :" + j2.toSeconds());
		
		// 4. Operasi Relasional (Perbadingan)
		int perbandingan = j1.compareTo(j2);
		if (perbandingan > 0) {
			System.out.println("Status                : Jam 1 lebih lambat (setelah) Jam 2");
		} else if (perbandingan < 0) {
			System.out.println("Status                : Jam 1 lebih awal (sebelum) Jam 2");
		} else {
			System.out.println("Status                : Jam 1 dan Jam 2 sama persis");
		}
		
		// 5. Operasi Aritmatika
		System.out.println("Durasi (J1 ke J2)         :" + Jam_2511533011.durasiDetik (j1, j2) + " detik ");
		
		Jam_2511533011 jNext = j1.nextSecond();
		System.out.println("Jam 1 Detik berikutnya    :" + jNext);
		
		Jam_2511533011 jPrev = j1.prevSecond();
		System.out.println("Jam 1 Detik sebelumnya    :" + jPrev);
		
		// 6. Operasi Penjumlahan Jam
		Jam_2511533011 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2             :" + jHasilPlus);
		
		
		input.close();
		System.out.println("\nProgram Selesai.");
	}

	private static Jam_2511533011 buatJamDariInput(Scanner input) {
		int h, m, s;
		while (true) {
			System.out.println("Masukkan Jam (0 - 23)     :");
			h = input.nextInt();
			System.out.println("Masukkan Menit (0 - 59)   :");
			m = input.nextInt();
			System.out.println("Masukkan Detik (0 - 59)   :");
			s = input.nextInt();
			
			// Memanggil methid static isValid dari kelas Jam 
			if (Jam_2511533011.isValid(h, m, s)) {
				return new Jam_2511533011 (h, m, s);
			} else { 
				System.out.println("[Error] Input tidak valid! Silahkan ulangi.\n");
			}
		}
		
	}

}
