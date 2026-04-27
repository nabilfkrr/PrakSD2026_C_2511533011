package pekan4_2511533011;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511533011 {
	public static void main(String[] args) {
		Queue<Integer> q_3011 = new LinkedList<Integer>();
		q_3011.add(1);
		q_3011.add(2);
		q_3011.add(3);	// [1, 2, 3]
		System.out.println("sebelum reverse = " + q_3011);
		Stack<Integer> s_3011 = new Stack<Integer>();
		while (!q_3011.isEmpty()) {
			s_3011.push(q_3011.remove());
		}
		while (!s_3011.isEmpty()) {
			q_3011.add(s_3011.pop());
		}
		System.out.println("sesudah reverse = " + q_3011); //	[3, 2, 1]
		
	}
}
