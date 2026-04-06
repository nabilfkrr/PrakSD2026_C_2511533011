package pekan2_2511533011;

public class DaftarKataDriver_2511533011 {
	public static void main(String[] args) {
		DaftarKata_2511533011 al = new DaftarKata_2511533011();
		
		// Menambah elemen (akhir)
		al.tambah_2511533011("Kami");
		al.tambah_2511533011("Informatika");
		
		//Menyisipkan elemen pada indeks 1
		al.tambahPada_2511533011(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println("Awal 			: " + al);
		
		// Mengubah elemen (index 1)
		al.ubahElemen_2511533011(1, "Departemen");
		System.out.println("Setelah Ubah 		:" + al);
		
		// Menghapus elemen (index 1)
		String terhapus = al.hapusElemen_2511533011(0);
		System.out.println("Terhapus 		: " + terhapus);
		System.out.println("Setelah Hapus 		: " + al);
		
		// Iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi 			:");
		al.iterasiCetak_2511533011();
		System.out.println();
	}

}
