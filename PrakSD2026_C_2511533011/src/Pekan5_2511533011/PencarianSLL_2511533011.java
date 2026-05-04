package Pekan5_2511533011;

public class PencarianSLL_2511533011 {
    static boolean searchKey(NodeSLL_2511533011 head_3031, int key_3031) {
        NodeSLL_2511533011 curr_3011 = head_3031;
        while (curr_3011 != null) {
            if (curr_3011.data_3011 == key_3031)
                return true;
            curr_3011 = curr_3011.next_3011; }
        return false; }
    public static void traversal(NodeSLL_2511533011 head_3011) {
        // mulai dari head
        NodeSLL_2511533011 curr_3011 = head_3011;
        // telusuri sampai pointer null
        while (curr_3011 != null) {
            System.out.print(" " + curr_3011.data_3011);
            curr_3011 = curr_3011.next_3011; }
        System.out.println();}
    public static void main(String[] args) {
        NodeSLL_2511533011 head_3011 = new NodeSLL_2511533011(14);
        head_3011.next_3011 = new NodeSLL_2511533011(21);
        head_3011.next_3011.next_3011 = new NodeSLL_2511533011(13);
        head_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(30);
        head_3011.next_3011.next_3011.next_3011.next_3011 = new NodeSLL_2511533011(10);
        System.out.print("Penelusuran SLL : ");
        traversal(head_3011);
        // data yang akan dicari
        int key_3011 = 30;
        System.out.print("cari data " + key_3011 + " = ");
        if (searchKey(head_3011, key_3011))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}