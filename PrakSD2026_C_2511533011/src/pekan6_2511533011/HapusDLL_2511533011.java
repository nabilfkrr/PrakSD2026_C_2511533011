package pekan6_2511533011;

public class HapusDLL_2511533011 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533011 delHead_2511533011(NodeDLL_2511533011 head_3011) {
		if (head_3011 == null) {
			return null;
		}
		NodeDLL_2511533011 temp_3011 = head_3011;
		head_3011 = head_3011.next_3011;
		if (head_3011 != null) {
			head_3011.prev_3011 = null;
		}
			return head_3011;
	}
	// fungsi menghapus di akhir
	public static NodeDLL_2511533011 delLast_2511533011(NodeDLL_2511533011 head_3011) {
		if (head_3011 == null) {
			return null;
		}
		if (head_3011.next_3011 == null) {
			return null;
		}
		NodeDLL_2511533011 curr_3011 = head_3011;
		while (curr_3011.next_3011 != null) {
			curr_3011 = curr_3011.next_3011;
		}
		// update pointer previous node
		if (curr_3011.prev_3011 != null) {
			curr_3011.prev_3011.next_3011 = null;
		}
		return head_3011;
		
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeDLL_2511533011 delPos_2511533011(NodeDLL_2511533011 head_3011, int pos_3011) {
		// jika DLL kosong
		if (head_3011 == null) {
			return head_3011;
		}
		NodeDLL_2511533011 curr_3011 = head_3011;
		// telusuri sampai node yang akan dihapus
		for (int i = 1; curr_3011 != null && i < pos_3011; ++i) {
			curr_3011 = curr_3011.next_3011;
		}
		// jika posisi tidak ditemukan
		if (curr_3011 == null) {
			return head_3011;
		}
		// update pointer
		if (curr_3011.prev_3011 != null) {
			curr_3011.prev_3011.next_3011 = curr_3011.next_3011;
		}
		if (curr_3011.next_3011 != null) {
			curr_3011.next_3011.prev_3011 = curr_3011.prev_3011;
		}
		// jika yang dihapus head
		if (head_3011 == curr_3011) {
			head_3011 = curr_3011.next_3011;
		}
		return head_3011;
	}
	// fungsi mencetak DLL
	public static void printList_2511533011 (NodeDLL_2511533011 head_3011) {
		NodeDLL_2511533011 curr_3011 = head_3011;
		while (curr_3011 != null) {
			System.out.print(curr_3011.data_3011 + " ");
			curr_3011 = curr_3011.next_3011;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//buat sebuah DLL
		NodeDLL_2511533011 head_3011 = new NodeDLL_2511533011(1);
		head_3011.next_3011 = new NodeDLL_2511533011(2);
		head_3011.next_3011.prev_3011 = head_3011;
		head_3011.next_3011.next_3011 = new NodeDLL_2511533011(3);
		head_3011.next_3011.next_3011.prev_3011 = head_3011.next_3011;
		head_3011.next_3011.next_3011.next_3011 = new NodeDLL_2511533011(4);
		head_3011.next_3011.next_3011.next_3011.prev_3011 = head_3011.next_3011.next_3011;
		head_3011.next_3011.next_3011.next_3011.next_3011 = new NodeDLL_2511533011(5);
		head_3011.next_3011.next_3011.next_3011.next_3011.prev_3011 = head_3011.next_3011.next_3011.next_3011;
		
		System.out.print("DLL Awal : ");
		printList_2511533011(head_3011);
		
		System.out.print("Setelah head dihapus : ");
		head_3011 = delHead_2511533011(head_3011);
		printList_2511533011(head_3011);
		
		System.out.print("Setelah node terakhir dihapus : ");
		head_3011 = delLast_2511533011(head_3011);
		printList_2511533011(head_3011);
		
		System.out.print("menghapus node ke 2 : ");
		head_3011 = delPos_2511533011(head_3011, 2);
		printList_2511533011(head_3011);
	}
}

