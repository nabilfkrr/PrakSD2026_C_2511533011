package pekan4_2511533011;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2511533011 {
	public static void main(String[] args) {
		{
			Queue<String> q_3011 = new LinkedList<>();
			
			q_3011.add("Praktikum");
			q_3011.add("Struktur");
			q_3011.add("Data");
			q_3011.add("Dan");
			q_3011.add("Algoritma");
			Iterator<String> iterator_3011 = q_3011.iterator();
			while (iterator_3011.hasNext()) {
				System.out.print(iterator_3011.next() + " ");
			}
		}
	}
}
