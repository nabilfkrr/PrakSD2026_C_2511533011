package pekan6_2511533011;

public class PenulusuranDLL_2511533011 {
	// fungsi penulusuran maju
		static void forwardTraversal_2511533011(NodeDLL_2511533011 head_3011) {
			// mulai penelusuran dari head
			NodeDLL_2511533011 curr_3011 = head_3011;
			// lanjutkan sampai akhir
			while (curr_3011 != null) {
				// print data
				System.out.print(curr_3011.data_3011 + " <-> ");
				// pindah ke node berikutnuya
				curr_3011 = curr_3011.next_3011;
			}
			// print spasi
			System.out.println();
		}
		// fungsi penelusuran mundur
		static void backwardTraversal_2511533011(NodeDLL_2511533011 tail_3011) {
			// mulai dari akhir
			NodeDLL_2511533011 curr_3011 = tail_3011; 
			// lanjut sampai head
			while (curr_3011 != null) {
				// cetak data
				System.out.print(curr_3011.data_3011 + " <-> ");
				// pindah ke node sebelumnya
				curr_3011 = curr_3011.prev_3011;
			}
			// cetak spasi
			System.out.println();
		}
		
		public static void main(String[] args) {
			// cetak DLL
			NodeDLL_2511533011 head_3011 = new NodeDLL_2511533011(1);
			NodeDLL_2511533011 second_3011 = new NodeDLL_2511533011(2);
			NodeDLL_2511533011 third_3011 = new NodeDLL_2511533011(3);
			
			head_3011.next_3011 = second_3011;
			second_3011.prev_3011 = head_3011;
			second_3011.next_3011 = third_3011;
			third_3011.prev_3011 = second_3011;
			
			System.out.println("Penelusuran maju : ");
			forwardTraversal_2511533011(head_3011);
			
			System.out.println("Penelusuran mundur : ");
			backwardTraversal_2511533011(third_3011);
		}
}
