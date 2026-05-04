package Pekan5_2511533011;

public class HapusSLL_2511533011 {

    // Fungsi untuk menghapus head
    public static NodeSLL_2511533011 deleteHead_3011(NodeSLL_2511533011 head_3011) {
        // Jika SLL kosong
        if (head_3011 == null)
            return null;
        // Pindahkan head ke node berikutnya
        head_3011 = head_3011.next_3011;
        // Return head baru
        return head_3011;
    }

    // Fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533011 removeLastNode_3011(NodeSLL_2511533011 head_3011) {
        // Jika list kosong, return null
        if (head_3011 == null) {
            return null;
        }
        // Jika list satu node, hapus node dan return null
        if (head_3011.next_3011 == null) {
            return null;
        }
        // Temukan node terakhir ke data
        NodeSLL_2511533011 secondLast_3011 = head_3011;
        while (secondLast_3011.next_3011.next_3011 != null) {
            secondLast_3011 = secondLast_3011.next_3011;
        }
        // Hapus node terakhir
        secondLast_3011.next_3011 = null;
        return head_3011;
    }

    // Fungsi menghapus node di posisi tertentu
    public static NodeSLL_2511533011 deleteNode_3011(NodeSLL_2511533011 head_3011, int position_3011) {
        NodeSLL_2511533011 temp_3011 = head_3011;
        NodeSLL_2511533011 prev_3011 = null;

        // Jika linked list null
        if (temp_3011 == null) {
            return head_3011;
        }

        // Kasus 1: hapus head (posisi 1)
        if (position_3011 == 1) {
            head_3011 = temp_3011.next_3011;
            return head_3011;
        }

        // Kasus 2: menghapus node di tengah
        // Telusuri ke node yang dihapus
        for (int i = 1; temp_3011 != null && i < position_3011; i++) {
            prev_3011 = temp_3011;
            temp_3011 = temp_3011.next_3011;
        }

        // Jika ditemukan, hapus node
        if (temp_3011 != null) {
            prev_3011.next_3011 = temp_3011.next_3011;
        } else {
            System.out.println("Data tidak ada");
        }
        return head_3011; 
        }

    // Fungsi mencetak SLL
    public static void printList(NodeSLL_2511533011 head_3011) {
        NodeSLL_2511533011 curr_3011 = head_3011;
        while (curr_3011.next_3011 != null) {
            System.out.print(curr_3011.data_3011 + " --> ");
            curr_3011 = curr_3011.next_3011;
        }
            if (curr_3011.next_3011 == null) {
                System.out.print(curr_3011.data_3011); }
            System.out.println();
        }

    // Method main
    public static void main(String[] args) {
        // Buat SLL: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        NodeSLL_2511533011 head_3011 = new NodeSLL_2511533011(1);
        head_3011.next_3011 = new NodeSLL_2511533011(2);
        head_3011.next_3011.next_3011 = new NodeSLL_2511533011(3);
        head_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(4);
        head_3011.next_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(5);
        head_3011.next_3011.next_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(6);

        // Cetak list awal
        System.out.print("List awal : ");
        printList(head_3011);
        // hapus head
        head_3011 = deleteHead_3011(head_3011);
        System.out.print("List setelah head dihapus");
        printList(head_3011);
        // Hapus node terakhir
        head_3011 = removeLastNode_3011(head_3011);
        System.out.print("List setelah simpul terakhir dihapus : ");
        printList(head_3011);

        // Hapus node di posisi 2
        int position_3011 = 2;
        head_3011 = deleteNode_3011(head_3011, position_3011);
        System.out.print("List setelah posisi 2 dihapus : ");
        printList(head_3011);
    }
}