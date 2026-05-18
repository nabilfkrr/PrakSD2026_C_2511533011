package pekan7_2511533011;

public class InsertionSort_2511533011 {
	public static void  insertionSort (int[] arr_3011) {
		int n_3011 = arr_3011.length;
		for (int i_3011 = 1; i_3011 < n_3011; i_3011++) {
			int key_3011 = arr_3011[i_3011];
			int j_3011 = i_3011 -1;
			while (j_3011 >= 0 && arr_3011[j_3011] > key_3011) {
				arr_3011 [j_3011 + 1] = arr_3011[j_3011];
				j_3011--;
			}
			arr_3011 [j_3011 +1] = key_3011;
		}
	}
public static void main(String[] args) {
	int arr_3011[] = {23,78, 45, 8, 32, 56, 1};
	int n_3011 = arr_3011.length;
	System.out.printf("array yang belum terurut :\n");
	for (int i_3011 = 0; i_3011 < n_3011; i_3011++)
			System.out.printf(arr_3011[i_3011] + " ");
	System.out.println("");
	insertionSort(arr_3011);
	System.out.printf("array yang terurut :\n");
	for (int i_3011 = 0; i_3011 < n_3011; i_3011++ )
		System.out.print(arr_3011[i_3011] + " ");
	System.out.println("");
}
}
