package pekan6_2511533011;

public class InsertDLL_2511533011 {
	// menambahkan node di awal dll
	static NodeDLL_2511533011 insertBegin_3011 (NodeDLL_2511533011 head_3011, int data_3011) {
		// buat node baru
		NodeDLL_2511533011 new_node_3011 = new NodeDLL_2511533011 (data_3011);
		// jadikan pointer nextnya head
		new_node_3011.next_3011 = head_3011;
		// jadikan pointer prev head ke new node
		if (head_3011 != null) {
			head_3011.prev_3011 = new_node_3011;		
		}
		return new_node_3011;
	}
	// fungsi menambahkan node di akhir 
	public static NodeDLL_2511533011 insertEnd_3011 (NodeDLL_2511533011 head_3011, int newData_3011) {
		// buat node baru
		NodeDLL_2511533011 newNode_3011 = new NodeDLL_2511533011 (newData_3011);
		// jika dll null jadikan head
		if (head_3011 == null) {
			head_3011 = newNode_3011;	
		} else {
			NodeDLL_2511533011 curr_3011 = head_3011;
			while (curr_3011.next_3011 != null) {
				curr_3011 = curr_3011.next_3011;
			}
			curr_3011.next_3011 = newNode_3011;
			newNode_3011.prev_3011 = curr_3011;
		}
		return head_3011;	
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511533011 insertAtPosition (NodeDLL_2511533011 head_3011, int pos_3011, int new_data_3011) {
		// buat node baru
		NodeDLL_2511533011 new_node_3011 = new NodeDLL_2511533011 (new_data_3011);
		if (pos_3011 == 1) {
			new_node_3011.next_3011 = head_3011;
			if (head_3011 != null) {
				head_3011.prev_3011 = new_node_3011;
			}
			head_3011 = new_node_3011;
			return head_3011;
		}
		NodeDLL_2511533011 curr_3011 = head_3011;
		for (int i=1 ; i < pos_3011 - 1 && curr_3011 != null; i++) {
			curr_3011 = curr_3011.next_3011; 
			}
			if (curr_3011 == null) {
				System.out.println("Posisi tidak ada");
				return head_3011;
			}
			new_node_3011.prev_3011 = curr_3011;
			new_node_3011.next_3011 = curr_3011.next_3011;
			curr_3011.next_3011 = new_node_3011;
			if (new_node_3011.next_3011 != null) {
				new_node_3011.next_3011.prev_3011 = new_node_3011;
			}
		return head_3011;
	}
	public static void printList_3011 (NodeDLL_2511533011 head_3011) {
		NodeDLL_2511533011 curr_3011 = head_3011;
		while (curr_3011 != null) {
			System.out.print(curr_3011.data_3011 + " <-> ");
			curr_3011 = curr_3011.next_3011;
		}
		System.out.println();
	}
	public static void main (String [] args) {
		// membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511533011 head_3011 = new NodeDLL_2511533011 (2);
		head_3011.next_3011 = new NodeDLL_2511533011 (3);
		head_3011.next_3011.prev_3011 = head_3011;
		head_3011.next_3011.next_3011 = new NodeDLL_2511533011 (5);
		head_3011.next_3011.next_3011.prev_3011 = head_3011.next_3011;
		// cetak dll awal
		System.out.print("DLL Awal: ");
		printList_3011(head_3011);
		// tambah 1 di awal
		head_3011 = insertBegin_3011 (head_3011,1);
		System.out.println("Simpul 1 ditambah di awal : ");
		printList_3011 (head_3011);
		// tambah 6 di akhir 
		System.out.println("simpul 6 di tambah di akhir: ");
		int data_3011 = 6;
		head_3011 = insertEnd_3011 (head_3011, data_3011);
		printList_3011 (head_3011);
		// menambahkan node 4 di posisi 4
		System.out.println("tambah node 4 di posisi 4: ");
		int data2_3011 = 4;
		int pos_3011 = 4;
		head_3011 = insertAtPosition (head_3011, pos_3011, data2_3011);
		printList_3011(head_3011);
	}

}