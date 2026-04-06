package pekan2_2511533011;
import java.util.ArrayList;

public class DaftarKata_2511533011 {
	private final ArrayList<String> data;
	// Konstruktor : inisialisasi list kosong
	public DaftarKata_2511533011() {
		this.data = new ArrayList<>();
	}
	/** Menentukan elemen di akhir list. */
	public void tambah_2511533011(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada_2511533011(int index, String elemen) {
		data.add(index, elemen);
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaBaru'.
	 * Bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElemen_2511533011(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);		
	}
	/**
	 * Menghapus elemen pada posisi 'index' dan mengembalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511533011(int index) {
		return data.remove(index);
	}
	
	public void iterasiCetak_2511533011() {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
		}
	}
	
	/** mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
	}
	
	// Representasi String agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}
}
