package Pekan5_2511533011;

public class TambahSLL_2511533011 {

    public static NodeSLL_2511533011 InsertAtFront(NodeSLL_2511533011 head_3011, int value_3011) {
        NodeSLL_2511533011 new_node = new NodeSLL_2511533011(value_3011);
        new_node.next_3011 = head_3011; 
        return new_node;
    }

    public static NodeSLL_2511533011 insertAtEnd(NodeSLL_2511533011 head_3011, int value_3011) {
        NodeSLL_2511533011 newNode = new NodeSLL_2511533011(value_3011);
        if (head_3011 == null) {
            return newNode;
        }
        NodeSLL_2511533011 last_3011 = head_3011;
        while (last_3011.next_3011 != null) {
            last_3011 = last_3011.next_3011;  
        }
        last_3011.next_3011 = newNode;        
        return head_3011;
    }

    static NodeSLL_2511533011 GetNode(int data_3011) {
        return new NodeSLL_2511533011(data_3011);
    }

    static NodeSLL_2511533011 insertPos(NodeSLL_2511533011 headNode_3011, 
                                         int position_3011, int value_3011) {
        NodeSLL_2511533011 head_3011 = headNode_3011;

        if (position_3011 < 1) {
            System.out.print("Invalid Position");
            return head_3011; // ✅ tambah return
        }
        if (position_3011 == 1) {
            NodeSLL_2511533011 new_node = new NodeSLL_2511533011(value_3011);
            new_node.next_3011 = head_3011; // ✅ fix hyperlink
            return new_node;
        } else {
            while (position_3011-- != 1) {
                if (position_3011 == 1) {
                    NodeSLL_2511533011 newNode = GetNode(value_3011);
                    newNode.next_3011 = headNode_3011.next_3011;    
                    headNode_3011.next_3011 = newNode;         
                    break;
                }
                headNode_3011 = headNode_3011.next_3011;       
            }
            if (position_3011 != 1)
                System.out.print("Posisi di luar jangkauan");
            return head_3011;
        }
    }

    public static void printList(NodeSLL_2511533011 head_3011) {
        NodeSLL_2511533011 curr_3011 = head_3011;
        while (curr_3011 != null) { 
            System.out.print(curr_3011.data_3011); 
            if (curr_3011.next_3011 != null) System.out.print(" --> ");
            curr_3011 = curr_3011.next_3011;       
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ✅ fix: buat semua node secara eksplisit
        NodeSLL_2511533011 head_3011 = new NodeSLL_2511533011(2);
        head_3011.next_3011 = new NodeSLL_2511533011(3);
        head_3011.next_3011.next_3011 = new NodeSLL_2511533011(5);
        head_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(6);

        System.out.print("Senarai berantai awal : ");
        printList(head_3011);

        System.out.print("Tambah 1 simpul di depan : ");
        head_3011 = InsertAtFront(head_3011, 1);
        printList(head_3011);

        System.out.print("Tambah 1 simpul di belakang : ");
        head_3011 = insertAtEnd(head_3011, 7);
        printList(head_3011);

        System.out.print("Tambah 1 simpul ke posisi 4 : ");
        head_3011 = insertPos(head_3011, 4, 4);
        printList(head_3011);
    }
}