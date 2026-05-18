package pekan7_2511533011;

public class BubbleSort_2511533011 {
	public static void BubbleSort_2511533011 (int[] arr_3011) {
		int n_3011 = arr_3011.length;
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++) {
			for (int j_3011 = 0; j_3011 < n_3011 - i_3011 - 1; j_3011++) {
				if (arr_3011[j_3011] > arr_3011[j_3011 + 1]) {
					int temp_3011 = arr_3011[j_3011];
					arr_3011[j_3011] = arr_3011[j_3011 + 1];
					arr_3011[j_3011 + 1] = temp_3011;
				// System.out.println("data : " + arr[j] + " +arr[j+1]); 				}
			
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_3011[] = {23,78, 45, 8, 32, 56, 1};
		int n_3011 = arr_3011.length;
		System.out.printf("array yang belum terurut :\n");
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++)
				System.out.printf(arr_3011[i_3011] + " ");
		System.out.println("");
		BubbleSort_2511533011(arr_3011);
		System.out.printf("array yang terurut menggunakan BubbleSort :\n");
		for (int i_3011 = 0; i_3011 < n_3011; i_3011++ )
			System.out.print(arr_3011[i_3011] + " ");
		System.out.println("");			
	}
}
	
