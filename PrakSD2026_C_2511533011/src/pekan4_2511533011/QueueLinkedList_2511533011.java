package pekan4_2511533011;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533011 {
	public static void main(String[] args) {
		Queue<Integer> q_3011 = new LinkedList<>();
		// tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_3011.add(i);
		// Menampilkan isi antrian
		System.out.println("Elemen Antrian" + q_3011);
		// Untuk menghapus kepala antrian.
		int hapus_3011 = q_3011.remove();
		System.out.println("Hapus elemen = " + hapus_3011);
		System.out.println(q_3011);
		// Untuk melihat antrian terdepan
		int depan_3011 = q_3011.peek();
		System.out.println("Kepala Antrian = " + depan_3011);
		
		int banyak_3011 = q_3011.size();
		System.out.println("size antrian = " + banyak_3011);
	}
}
