package pekan7_2511533011;

public class SelectionSort_2511533011 {
	public static void SelectionSort_2511533011 (int[] arr_3011) {
		int n_3011 = arr_3011.length;
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++) {
			int minIndex_3011 = i_3011;
			for (int j_3011 = i_3011 + 1; j_3011 < n_3011; j_3011++) {
				if (arr_3011[j_3011] < arr_3011[minIndex_3011]) {
					minIndex_3011 = j_3011;
				}
			}
			int temp_3011 = arr_3011[i_3011];
			arr_3011[i_3011] = arr_3011[minIndex_3011];
			arr_3011[minIndex_3011] = temp_3011;
		}
	}
	public static void main(String[] args) {
		int arr_3011[] = {23,78, 45, 8, 32, 56, 1};
		int n_3011 = arr_3011.length;
		System.out.printf("array yang belum terurut :\n");
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++)
				System.out.printf(arr_3011[i_3011] + " ");
		System.out.println("");
		SelectionSort_2511533011(arr_3011);
		System.out.printf("array yang terurut :\n");
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++ )
			System.out.print(arr_3011[i_3011] + " ");
		System.out.println("");			
	}
}
