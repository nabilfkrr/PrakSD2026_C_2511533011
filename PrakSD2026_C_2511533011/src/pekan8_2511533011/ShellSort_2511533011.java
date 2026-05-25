package pekan8_2511533011;

public class ShellSort_2511533011 {
	
	public static void shellSort_2511533011(int [] A) {
		int n_3011 = A.length;
		int gap_3011 = n_3011/2;
		while (gap_3011 > 0) {
			for (int i_3011 = gap_3011; i_3011 < n_3011; i_3011++) {
				int temp_3011 = A[i_3011];
				int j_3011 = i_3011;
				while (j_3011 >= gap_3011 && A [j_3011 - gap_3011] > temp_3011) {
					A[j_3011] = A[j_3011 - gap_3011];
					j_3011 = j_3011 - gap_3011;
				}
				A[j_3011] = temp_3011;
			}
			gap_3011 = gap_3011 /2;
		}
	}
	
	public static void main (String[] args) {
		int [] data = { 3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum : ");
		printArray_3011(data);
		
		shellSort_2511533011(data);
		
		System.out.print("Sesudah (Shell Sort) : ");
		printArray_3011(data);
	}
	
	public static void printArray_3011 (int[] arr) {
		for (int i : arr) System.out.print(i + " ");
		System.out.println();
	}
}
