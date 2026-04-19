package pekan2_2511533011;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533011 {
	public static void tampilkanMenu_3011() {
		System.out.println("===Playlist Musik NIM : 2511533011===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}
	
	public static void tambahLagu_3011 (ArrayList<Musik_2511533011>list, Scanner input) { 
		System.out.println("Masukkan Judul : ");
		String JudulLagu_3011 = input.nextLine();
		System.out.println("Masukkan Penyanyi : ");
		String Penyanyi_3011 = input.nextLine();
		System.out.println("Masukkan Durasi(detik) : ");
		int Durasi_3011 = input.nextInt();
		list.add(new Musik_2511533011(JudulLagu_3011, Penyanyi_3011, Durasi_3011));
		System.out.println("Data berhasil ditambahkan!");
	}
	
	public static void lihatPlaylist_3011 (ArrayList<Musik_2511533011>list) {
		if (list.isEmpty()) {
			System.out.println("Daftar Musik Kosong.");
		} else {
			System.out.println("Data Musik : ");
			for (Musik_2511533011 msk : list) {
				System.out.println(msk);
			}
		}
	}
	public static void hapusLagu_3011 (ArrayList<Musik_2511533011>list, Scanner input) {
		System.out.println("Masukkan judul lagu yang akan dihapus: ");
		String laguHapus = input.nextLine();
		boolean removed = list.removeIf(msk -> msk.JudulLagu_3011.equals(laguHapus));
		
		if (removed) {
			System.out.println("Data dengan Judul Lagu " + laguHapus + " berhasil dihapus.");
		} else {
			System.out.println("Data tidak ditemukan.");
		}
	}
	public static void main(String[] args) {
		ArrayList<Musik_2511533011>musikList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			tampilkanMenu_3011();
			System.out.println("Pilihan : ");
			choice = input.nextInt();
			input.nextLine();
			
			switch (choice) {
			case 1:
				tambahLagu_3011(musikList, input);
				break;
			case 2:
				lihatPlaylist_3011(musikList);
				break;
			case 3:
				hapusLagu_3011(musikList, input);
				break;
			case 4:
				System.out.println("Keluar dari Program.");
				break;
			default:
				System.out.println("Pilihan tidak valid.");
			}
		} while (choice != 4);
		input.close();
	}
}

